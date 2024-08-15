package org.example.contactmanager.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public ContactDTO(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }
}
