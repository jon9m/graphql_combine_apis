package com.nab.ebpo.documents.repository.digitize;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
@DefaultProperties(raiseHystrixExceptions = {HystrixException.RUNTIME_EXCEPTION})
public class DocumentDigitizationRepository {

}
