package com.example.rentProject.mappers;

import com.example.rentProject.model.Address;
import com.example.rentProject.model.Client;
import com.example.rentProject.model.dto.ClientAddressDto;
import com.example.rentProject.model.dto.ClientDto;
import org.apache.catalina.LifecycleState;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    // ClientDto -> Client


    @Mapping(source = "clientId", target = "id")
    @Mapping(source = "firstName", target = "name")
    Client clientDtoToClient(ClientDto clientDto);

    @InheritInverseConfiguration
    ClientDto clientToClientDto(Client client);

    @Mapping(target = "client.address", source = "address")
    Client clientAddressDtoToClient(ClientAddressDto clientAddressDto, Address address);

    List<ClientDto> clientsToClientDtos(List<Client> clients);


}
