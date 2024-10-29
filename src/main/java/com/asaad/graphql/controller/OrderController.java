package com.asaad.graphql.controller;

import com.asaad.graphql.model.Customer;
import com.asaad.graphql.model.Order;
import com.asaad.graphql.repository.OrderRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {


    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @QueryMapping
    public Iterable<Order> orders(){
        return this.orderRepository.findAll();
    }

    @QueryMapping
    public Iterable<Order> orderByCustomerEmail(@Argument String email){
        return this.orderRepository.findByCustomer_email(email);
    }
}
