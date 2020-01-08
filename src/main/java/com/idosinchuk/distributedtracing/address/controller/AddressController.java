package com.idosinchuk.distributedtracing.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.idosinchuk.distributedtracing.address.dto.Address;
import com.idosinchuk.distributedtracing.address.service.AddressService;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping(value = "/addresses/{addressId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Address getAddress(@PathVariable Integer addressId) {
        return addressService.getAddress(addressId);
    }
}