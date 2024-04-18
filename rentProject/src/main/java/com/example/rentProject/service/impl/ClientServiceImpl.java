package com.example.rentProject.service.impl;

import com.example.rentProject.mappers.ClientMapper;
import com.example.rentProject.model.Address;
import com.example.rentProject.model.Client;
import com.example.rentProject.model.dto.ClientAddressDto;
import com.example.rentProject.model.dto.ClientDto;
import com.example.rentProject.repository.ClientRepo;
import com.example.rentProject.service.AddressService;
import com.example.rentProject.service.ClientService;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepo clientRepo;
    private final AddressService addressService;

    public ClientServiceImpl(ClientRepo clientRepo, AddressService addressService) {
        this.clientRepo = clientRepo;
        this.addressService = addressService;
    }

    @Override
    public ClientAddressDto save(ClientAddressDto clientAddressDto) {

        Address address = addressService.saveClientAddress(clientAddressDto);

        Client client = ClientMapper.INSTANCE.clientAddressDtoToClient(clientAddressDto, address);
        client = clientRepo.save(client);

        clientAddressDto.setId(client.getId());

        return clientAddressDto;
    }

    @Override
    public List<ClientDto> getClients(int rowsCount, int pageNumber) {
        List<Client> clients = clientRepo.findAllOrderByLastName(PageRequest.of(pageNumber, rowsCount));
        return ClientMapper.INSTANCE.clientsToClientDtos(clients);
    }
}
