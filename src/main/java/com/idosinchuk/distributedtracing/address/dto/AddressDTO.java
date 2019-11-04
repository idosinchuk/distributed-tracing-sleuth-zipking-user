package com.idosinchuk.distributedtracing.address.dto;

import lombok.Data;

@Data
public class AddressDTO {

    private Integer addressId;

    private String street;

    private Integer number;

    private Integer floor;

    private String city;

    private String postalCode;

    private String country;

}