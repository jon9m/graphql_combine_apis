package com.nab.ebpo.documents.db;

import com.nab.ebpo.documents.repository.entity.Email;
import org.springframework.data.repository.CrudRepository;

public interface EmailRepo extends CrudRepository<Email, String> {
}
