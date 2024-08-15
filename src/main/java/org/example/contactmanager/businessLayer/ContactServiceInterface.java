package org.example.contactmanager.businessLayer;

import org.example.contactmanager.model.Contact;
import org.example.contactmanager.model.ContactDTO;

import java.util.List;
import java.util.UUID;

public interface ContactServiceInterface<T,U> {
    U getContactById (int id);
    List<T> getAllContacts();
    T createContact(U contactDTO);

    U updateContact (int id, U newContact);
    boolean deleteContactById(int id);
}
