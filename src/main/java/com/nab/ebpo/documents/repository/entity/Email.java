package com.nab.ebpo.documents.repository.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Email {

    @Id
    private String id;
    private String primaryEmail;
    private String secondaryEmail;
}
