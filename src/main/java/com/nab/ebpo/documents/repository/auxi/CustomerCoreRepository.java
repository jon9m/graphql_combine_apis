package com.nab.ebpo.documents.repository.auxi;

import com.nab.ebpo.documents.db.CustomerRepo;
import com.nab.ebpo.documents.repository.entity.CustomerDetail;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Component
@RequiredArgsConstructor
@DefaultProperties(raiseHystrixExceptions = {HystrixException.RUNTIME_EXCEPTION})
public class CustomerCoreRepository {

    private final WebClient webClient = WebClient.create("http://localhost:8080");
    private CustomerRepo customerRepo;

    @HystrixCommand(commandKey = "customer")
    public CustomerDetail getCustomerDetails(String id) {
        return webClient.get()
                .uri("/customer")
                .accept(MediaType.APPLICATION_JSON)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve().bodyToMono(CustomerDetail.class)
                .block();

    }
}
