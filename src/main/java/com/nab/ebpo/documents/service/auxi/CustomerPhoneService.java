package com.nab.ebpo.documents.service.auxi;

import com.nab.ebpo.documents.repository.auxi.CustomerPhoneRepository;
import com.nab.ebpo.documents.repository.entity.Phone;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerPhoneService {

    @Autowired
    private CustomerPhoneRepository customerPhoneRepository;

    public Phone getCustomerPhoneById(String id) {
        return customerPhoneRepository.getPhoneDetails(id);
    }
}
