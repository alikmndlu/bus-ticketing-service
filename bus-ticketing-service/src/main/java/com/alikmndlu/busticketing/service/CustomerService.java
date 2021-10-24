package com.alikmndlu.busticketing.service;

import com.alikmndlu.busticketing.model.Customer;

public interface CustomerService {
    void addCustomer(Customer customer);
    Customer findByUsernameAndPassword(String username, String password);
    boolean existsCustomerByUsername(String username);
}
