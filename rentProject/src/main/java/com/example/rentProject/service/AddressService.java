package com.example.rentProject.service;

import com.example.rentProject.model.Address;
import com.example.rentProject.model.dto.ClientAddressDto;
import org.apache.tomcat.util.buf.EncodedSolidusHandling;

public interface AddressService {
    Address saveClientAddress(ClientAddressDto clientAddressDto);
}


// SOLID

