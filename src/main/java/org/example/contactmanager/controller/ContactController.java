package org.example.contactmanager.controller;

import org.example.contactmanager.model.Contact;
import org.example.contactmanager.model.ContactDTO;
import org.example.contactmanager.persistentLayer.ContactRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contactManager")
public class ContactController {
    @Autowired
    private ContactRepositoryInterface repositoryInterface;

    @PostMapping("create")
    public Contact createContact(@RequestBody  ContactDTO contactDTO) {
        return (Contact) repositoryInterface.createContact(contactDTO);
    }

    @GetMapping("getByID")
    public ContactDTO getContactById (@RequestBody  int id) {
        return (ContactDTO) repositoryInterface.getContactById(id);
    }

    @GetMapping("getAll")
    public List<ContactDTO> getAllContacts () {
        return repositoryInterface.getAllContacts();
    }

    @PutMapping("update")
    public ContactDTO updateContact (@RequestBody  int id, ContactDTO newContact) {
        return (ContactDTO) repositoryInterface.updateContact(id, newContact);
    }

    @DeleteMapping("delete")
    public boolean deleteContactById(@RequestBody int id) {
        return repositoryInterface.deleteContactById(id);
    }


}
