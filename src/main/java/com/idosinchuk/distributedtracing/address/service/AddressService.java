package com.idosinchuk.distributedtracing.address.service;

import com.idosinchuk.distributedtracing.address.dto.Address;

public interface AddressService {

    Address getAddress(Integer addressId);
}