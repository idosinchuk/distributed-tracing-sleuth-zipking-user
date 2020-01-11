package com.idosinchuk.distributedtracing.user.dto;

import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {

	@Id
    private final Integer userId;

    private final String name;

    private final String surname;

    private final String identityCard;

    private final String dateOfBirth;

    private final Integer addressId;

}