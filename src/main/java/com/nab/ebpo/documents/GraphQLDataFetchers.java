package com.nab.ebpo.documents;

import com.nab.ebpo.documents.repository.entity.CustomerDetail;
import com.nab.ebpo.documents.service.auxi.CustomerCoreService;
import com.nab.ebpo.documents.service.auxi.CustomerEmailService;
import com.nab.ebpo.documents.service.auxi.CustomerPhoneService;
import graphql.schema.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GraphQLDataFetchers {

    @Autowired
    private CustomerCoreService customerCoreService;
    @Autowired
    private CustomerPhoneService customerPhoneService;
    @Autowired
    private CustomerEmailService emailService;


    public DataFetcher getCustomerByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            String customerId = dataFetchingEnvironment.getArgument("id");

            return customerCoreService.getCustomerById(customerId);
        };
    }

    public DataFetcher getEmailDataFetcher() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return dataFetchingEnvironment -> {
            CustomerDetail customer = dataFetchingEnvironment.getSource();
            String emailId = customer.getId();
            return emailService.getEmailById(emailId);

        };
    }

    public DataFetcher getPhoneDataFetcher() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return dataFetchingEnvironment -> {
            CustomerDetail customer = dataFetchingEnvironment.getSource();
            String customerId = customer.getId();
            return customerPhoneService.getCustomerPhoneById(customerId);
        };
    }
}
