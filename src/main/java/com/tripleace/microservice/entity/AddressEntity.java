package com.tripleace.microservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "Address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String address1;

    private String address2;

    private String state;

    private String country;
}
