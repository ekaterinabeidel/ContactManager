package org.example.contactmanager.businessLayer;

import org.example.contactmanager.model.Contact;

import java.util.List;

public class InMemoryContactService implements  ContactServiceInterface{
    @Override
    public Contact getContactById() {
        return null;
    }

    @Override
    public List<Contact> getAllContacts() {
        return null;
    }

    @Override
    public Contact createContact() {
        return null;
    }

    @Override
    public Contact updateContact(int id, Contact newContact) {
        return null;
    }

    @Override
    public boolean deleteContactById(int id) {
        return false;
    }
}
