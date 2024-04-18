package com.example.rentProject.mappers;

import com.example.rentProject.model.Address;
import com.example.rentProject.model.dto.ClientAddressDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address clientAddressDtoToAddress(ClientAddressDto clientAddressDto);

}
