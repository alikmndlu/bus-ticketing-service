package com.alikmndlu.busticketing.controller;

import com.alikmndlu.busticketing.model.Customer;
import com.alikmndlu.busticketing.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model, HttpSession session) {
        if (session.getAttribute("customer") != null){
            return "redirect:/dashboard";
        }
        model.addAttribute("customer", new Customer());
        return "authenticate/register";
    }

    @PostMapping("/process_register")
    public String processRegister(HttpServletRequest request, Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String passwordConfirm = request.getParameter("passwordConfirm");

        if (customerService.existsCustomerByUsername(username)){
            model.addAttribute("message", "Reason : Username Taken Before, Pick AnotherOne!!");
            return "authenticate/register_fail";
        }

        if (!password.equals(passwordConfirm)){
            model.addAttribute("message", "Reason : Password & Password Confirm Must Be Equal!!");
            return "authenticate/register_fail";
        }

        return "authenticate/register_success";
    }

    @GetMapping("/login")
    public String showLoginForm(HttpSession session) {
        if (session.getAttribute("customer") != null){
            return "redirect:/dashboard";
        }
        return "authenticate/login";
    }

    @PostMapping("/process_login")
    public String processLogin(HttpServletRequest request, HttpSession session, Model model) {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Customer customer = customerService.findByUsernameAndPassword(username, password);

        if (customer == null){
            model.addAttribute("message", "Customer Not Found!");
            return "authenticate/login_fail";
        }

        session.setAttribute("customer", customer);
        return "redirect:/dashboard";
    }

    @GetMapping("/dashboard")
    public String showDashboardView(HttpSession session){
        if (session.getAttribute("customer") == null){
            return "redirect:/login";
        }
        return "dashboard/index";
    }

    @PostMapping("logout")
    public String logoutProcess(HttpSession session){
        if (session.getAttribute("customer") == null){
            return "redirect:/login";
        } else {
            session.removeAttribute("customer");
            return "redirect:/login";
        }
    }
}
