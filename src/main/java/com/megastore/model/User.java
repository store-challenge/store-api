package com.megastore.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//@Data
//@Entity
//@Table(name="userprofile", catalog = "public")
@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column()
    private String username;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "role_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    @Column(nullable = false)
    private Boolean enabled;

    public User() {
        super();
        this.enabled = true;
    }

}
