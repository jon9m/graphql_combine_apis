package com.nab.ebpo.documents.controller;

import com.nab.ebpo.documents.db.EmailRepo;
import com.nab.ebpo.documents.repository.entity.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserEmailController {

    @Autowired
    EmailRepo emailRepo;

    @RequestMapping("/email/{id}")
    public Email findEmail(@PathVariable String id) {
        return emailRepo.findById(id).orElseThrow(() -> new RuntimeException("No email found"));
    }
}
