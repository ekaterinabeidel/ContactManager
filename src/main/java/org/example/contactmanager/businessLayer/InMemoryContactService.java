package org.example.contactmanager.businessLayer;

import org.example.contactmanager.model.Contact;
import org.example.contactmanager.model.ContactDTO;
import org.example.contactmanager.persistentLayer.InMemoryContactRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryContactService implements  ContactServiceInterface<Contact, Contact>{
    private  InMemoryContactRepository MemoryRepository;



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
