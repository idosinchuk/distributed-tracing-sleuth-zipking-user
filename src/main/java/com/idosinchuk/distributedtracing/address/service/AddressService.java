package com.idosinchuk.distributedtracing.address.service;

import com.idosinchuk.distributedtracing.address.dto.AddressDTO;

public interface AddressService {

    AddressDTO getAddress(Integer addressId) throws Exception;
}