package com.nab.ebpo.documents.service.auxi;

import com.nab.ebpo.documents.repository.auxi.EmailRepository;
import com.nab.ebpo.documents.repository.entity.Email;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerEmailService {

    @Autowired
    private EmailRepository emailRepository;

    public Email getEmailById(String id) {
        return emailRepository.getEmail(id);
    }
}
