package com.megastore.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


//@Table(name="userprofile", catalog = "public")
@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String email;
    @Column()
    private String username;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(nullable = false)
    private Boolean enabled;

    public User() {
        super();
        this.enabled = true;
    }

}
