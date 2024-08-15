package org.example.contactmanager.persistentLayer;

import org.example.contactmanager.model.Contact;
import org.example.contactmanager.model.ContactDTO;

import java.util.List;

public class DatabaseContactRepository implements ContactRepositoryInterface{

    @Override
    public ContactDTO getContactById(int id) {
        return null;
    }

    @Override
    public List<ContactDTO> getAllContacts() {
        return null;
    }

    @Override
    public Contact createContact(ContactDTO contactDTO) {
        return null;
    }

    @Override
    public ContactDTO updateContact(int id, ContactDTO newContact) {
        return null;
    }

    @Override
    public boolean deleteContactById(int id) {
        return false;
    }
}
