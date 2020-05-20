package com.nab.ebpo.documents.repository.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDetail {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String customerType;
    private String gender;
}
