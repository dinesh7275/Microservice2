package com.tripleace.microservice.model;

import lombok.Data;

@Data
public class Address {

    private int id;

    private String address1;

    private String address2;

    private String state;

    private String country;
}
