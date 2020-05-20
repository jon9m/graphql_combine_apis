package com.nab.ebpo.documents.repository.auxi;

import com.nab.ebpo.documents.repository.entity.Email;
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
public class EmailRepository {

    private final WebClient webClient = WebClient.create("http://localhost:8080");

    @HystrixCommand(commandKey = "email")
    public Email getEmail(String id) {
        return webClient.get()
                .uri("/email")
                .accept(MediaType.APPLICATION_JSON)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve().bodyToMono(Email.class)
                .block();

    }

}
