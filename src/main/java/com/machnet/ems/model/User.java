package com.machnet.ems.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
}
