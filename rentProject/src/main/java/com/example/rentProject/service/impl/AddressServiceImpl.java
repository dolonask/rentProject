package com.example.rentProject.service.impl;

import com.example.rentProject.mappers.AddressMapper;
import com.example.rentProject.model.Address;
import com.example.rentProject.model.dto.ClientAddressDto;
import com.example.rentProject.repository.AddressRepository;
import com.example.rentProject.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address saveClientAddress(ClientAddressDto clientAddressDto) {
        Address address = AddressMapper.INSTANCE.clientAddressDtoToAddress(clientAddressDto);
        address = addressRepository.save(address);
        return address;
    }
}
