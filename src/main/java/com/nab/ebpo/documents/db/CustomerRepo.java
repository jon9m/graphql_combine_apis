package com.nab.ebpo.documents.db;

import com.nab.ebpo.documents.repository.entity.CustomerDetail;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<CustomerDetail, String> {
}
