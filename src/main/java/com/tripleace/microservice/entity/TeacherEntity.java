package com.tripleace.microservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Teacher")
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;

    private String lastName;

    private String subject;

    @OneToOne(cascade = {CascadeType.ALL})
    private AddressEntity address;
}
