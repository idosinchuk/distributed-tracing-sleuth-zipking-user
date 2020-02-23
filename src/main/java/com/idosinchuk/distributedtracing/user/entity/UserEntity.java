package com.idosinchuk.distributedtracing.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "IDENTITY_CARD")
    private String identityCard;

    @Column(name = "DATE_OF_BIRTH")
    private String dateOfBirth;

    @Column(name = "ADDRESS_ID")
    private Integer addressId;}