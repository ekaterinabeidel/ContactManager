package org.example.contactmanager.businessLayer;

import org.example.contactmanager.model.Contact;
import org.example.contactmanager.model.ContactDTO;

import java.util.List;
import java.util.UUID;

public interface ContactServiceInterface {
    ContactDTO getContactById (int id);
    List<ContactDTO> getAllContacts();
    Contact createContact(ContactDTO contactDTO);
    ContactDTO updateContact (int id, ContactDTO newContact);

    boolean deleteContactById(int id);
}
