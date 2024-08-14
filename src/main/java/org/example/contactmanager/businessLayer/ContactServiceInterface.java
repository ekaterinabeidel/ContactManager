package org.example.contactmanager.businessLayer;

import org.example.contactmanager.model.Contact;

import java.util.List;
import java.util.UUID;

public interface ContactServiceInterface {
    Contact getContactById ();
    List<Contact> getAllContacts();
    Contact createContact();
    Contact updateContact (int id, Contact newContact);
    boolean deleteContactById(int id);
}
