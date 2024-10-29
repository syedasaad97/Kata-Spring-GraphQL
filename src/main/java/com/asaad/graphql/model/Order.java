package com.asaad.graphql.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @Column(name="ORDER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    private Customer customer;


    @Column(name="ORDER_VALUE")
    private Double orderValue;
}
