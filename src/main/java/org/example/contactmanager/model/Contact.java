package org.example.contactmanager.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone;

    public Contact(String first_name, String last_name, String email, String phone) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
    }

}

