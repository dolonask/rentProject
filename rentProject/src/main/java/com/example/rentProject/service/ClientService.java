package com.example.rentProject.service;

import com.example.rentProject.model.dto.ClientAddressDto;
import com.example.rentProject.model.dto.ClientDto;

import java.util.List;

public interface ClientService {
    ClientAddressDto save(ClientAddressDto clientAddressDto);

    List<ClientDto> getClients(int rowsCount, int pageNumber);
}
