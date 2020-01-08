package com.idosinchuk.distributedtracing.address.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Address {

    private Integer addressId;

    private String street;

    private Integer number;

    private String floor;

    private String city;

    private String postalCode;

    private String country;

}