package com.giit.Microservices_1.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private Long customerId;

    @Column(name="name")
    private String CustomerName;

    @Column(name="address")
    private String Address;
}
