package com.megastore.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Data
//@Entity
//@Table(name="userprofile", catalog = "public")
public class UserProfile {

    private Long id;
    private String name;
    private String phone;
    private String email;
    private String address;
}
