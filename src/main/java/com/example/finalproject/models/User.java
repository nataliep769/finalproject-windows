package com.example.finalproject.models;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.management.relation.Role;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Collection;

import static javax.swing.text.StyleConstants.Size;

/**
 * Created by Natalie on 7/2/2017.
 */
@Entity //this is an entity in the database (I think)//
public class User {

    @Id
    @GeneratedValue
    private int userId;

    @NotNull
    @Size(min=7, message = "Username must be at least 7 characters")
    private String username;

    @NotNull
    @Size(min=8, message = "Password must be at least 8 characters")
    private String password;

    private String verify;

    @Email
    @NotEmpty(message = "Please enter a valid email address")
    private String email;

    public User() {
    }

    public User(String username, String password, String verify, String email) {
        this.username = username;
        this.password = password;
        this.verify = verify;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //include a verification method in this class?
}
