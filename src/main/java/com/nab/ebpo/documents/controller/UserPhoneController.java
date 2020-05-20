package com.nab.ebpo.documents.controller;

import com.nab.ebpo.documents.db.PhoneRepo;
import com.nab.ebpo.documents.repository.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserPhoneController {

    @Autowired
    PhoneRepo phoneRepo;

    @RequestMapping("/phone/{id}")
    public Phone findPhoneNumber(@PathVariable String id) {
        return phoneRepo.findById(id).orElseThrow(() -> new RuntimeException("No phone details found"));
    }
}
