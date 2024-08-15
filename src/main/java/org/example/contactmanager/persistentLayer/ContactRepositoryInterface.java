package org.example.contactmanager.persistentLayer;

import org.example.contactmanager.model.Contact;
import org.example.contactmanager.model.ContactDTO;

import java.util.List;

public interface ContactRepositoryInterface <T,U>{
    U getContactById (int id);
    List<T> getAllContacts();

    T createContact(U contactDTO);

    U updateContact (int id, U newContact);
    boolean deleteContactById(int id);
}
