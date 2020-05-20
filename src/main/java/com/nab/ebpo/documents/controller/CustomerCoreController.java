package com.nab.ebpo.documents.controller;

import com.nab.ebpo.documents.db.CustomerRepo;
import com.nab.ebpo.documents.repository.entity.CustomerDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerCoreController {

    @Autowired
    CustomerRepo customerRepo;

    @RequestMapping("/customer/{id}")
    public CustomerDetail findCustomer(@PathVariable String id) {
        return customerRepo.findById(id).orElseThrow(() -> new RuntimeException("No customer details found"));
    }
}
