package com.idosinchuk.distributedtracing.address.controller;

import com.idosinchuk.distributedtracing.address.dto.AddressDTO;
import com.idosinchuk.distributedtracing.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/addresses/{addressId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public AddressDTO getAddress(@PathVariable Integer addressId) throws Exception {
        return addressService.getAddress(addressId);
    }
}