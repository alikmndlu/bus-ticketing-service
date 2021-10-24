package com.alikmndlu.busticketing.repository;

import com.alikmndlu.busticketing.model.Customer;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByUsernameAndPassword(String username, String password);
    boolean existsCustomerByUsername(String username);
}
