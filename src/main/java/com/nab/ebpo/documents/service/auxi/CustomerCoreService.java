package com.nab.ebpo.documents.service.auxi;

import com.nab.ebpo.documents.repository.auxi.CustomerCoreRepository;
import com.nab.ebpo.documents.repository.entity.CustomerDetail;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerCoreService {
    private CustomerCoreRepository customerCoreRepository;

    public CustomerDetail getCustomerById(String id) {
        return customerCoreRepository.getCustomerDetails(id);
    }
}
