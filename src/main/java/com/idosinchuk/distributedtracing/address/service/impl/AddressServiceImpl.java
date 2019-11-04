package com.idosinchuk.distributedtracing.address.service.impl;

import com.idosinchuk.distributedtracing.address.dto.AddressDTO;
import com.idosinchuk.distributedtracing.address.entity.AddressEntity;
import com.idosinchuk.distributedtracing.address.repository.AddressRepository;
import com.idosinchuk.distributedtracing.address.service.AddressService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddressServiceImpl.class);

    private AddressRepository addressRepository;

    private ModelMapper modelMapper;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, ModelMapper modelMapper) {
        this.addressRepository = addressRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public AddressDTO getAddress(Integer addressId) throws Exception {
        LOGGER.info("Fetching Address details for addressId: {}", addressId);

        Optional<AddressEntity> addressEntity = addressRepository.findById(addressId);
        AddressDTO addressDTO = null;

        if (addressEntity.isPresent()) {
            addressDTO = modelMapper.map(addressEntity, AddressDTO.class);

        }

        return addressDTO;
    }
}