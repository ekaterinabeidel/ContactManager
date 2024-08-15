package org.example.contactmanager.businessLayer;

import org.example.contactmanager.model.Contact;
import org.example.contactmanager.model.ContactDTO;
import org.example.contactmanager.persistentLayer.InMemoryContactRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryContactService implements  ContactServiceInterface{
    InMemoryContactRepository  memoryRepository;

    @Override
    public ContactDTO getContactById(int id) throws Exception {
        if (id == 0) {
            throw new Exception("Incorrect id");
        }

        return memoryRepository.contactDTOList.get(id);
    }

    @Override
    public List<ContactDTO> getAllContacts() throws Exception {
        if (memoryRepository.contactDTOList.isEmpty()) {
            throw new Exception("List is empty");
        }
        return memoryRepository.contactDTOList;
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
