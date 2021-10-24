package com.alikmndlu.busticketing.service.impl;

import com.alikmndlu.busticketing.model.Customer;
import com.alikmndlu.busticketing.repository.CustomerRepository;
import com.alikmndlu.busticketing.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findByUsernameAndPassword(String username, String password) {
        return customerRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public boolean existsCustomerByUsername(String username) {
        return customerRepository.existsCustomerByUsername(username);
    }
}
