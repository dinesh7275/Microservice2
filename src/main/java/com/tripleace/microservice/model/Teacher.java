package com.tripleace.microservice.model;

import lombok.Data;

import javax.persistence.OneToOne;

@Data
public class Teacher {

    private int id;

    private String firstName;

    private String lastName;

    private String subject;

    private Address address;
}
