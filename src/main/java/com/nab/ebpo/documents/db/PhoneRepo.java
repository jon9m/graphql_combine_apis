package com.nab.ebpo.documents.db;

import com.nab.ebpo.documents.repository.entity.Phone;
import org.springframework.data.repository.CrudRepository;

public interface PhoneRepo extends CrudRepository<Phone, String> {
}
