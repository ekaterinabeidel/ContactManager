package org.example.contactmanager.model;

import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;

@Getter
@Setter
public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public Contact(int id, String firstName, String lastName, String email, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

}

