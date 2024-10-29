package com.asaad.graphql.repository;

import com.asaad.graphql.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,String> {

    List<Order> findByCustomer_email(String email);
}
