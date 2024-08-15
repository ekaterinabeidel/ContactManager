package org.example.contactmanager.persistentLayer;

import org.example.contactmanager.model.Contact;
import org.example.contactmanager.model.ContactDTO;

import java.util.ArrayList;
import java.util.List;

public class InMemoryContactRepository implements ContactRepositoryInterface<Contact, Contact>{
    private final List<Contact> contactList = new ArrayList<>();

    @Override
    public Contact getContactById(int id) {
        return null;
    }

    @Override
    public List<Contact> getAllContacts() {
        return null;
    }

    @Override
    public Contact createContact(Contact contact) {
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
