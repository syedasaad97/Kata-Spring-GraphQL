package com.asaad.graphql.repository;

import com.asaad.graphql.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findCustomerByEmail(String email);
    List<Customer> findCustomerByState(String state);
}
