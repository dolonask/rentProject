package com.example.rentProject.controllers;


import com.example.rentProject.model.dto.ClientAddressDto;
import com.example.rentProject.model.dto.ClientDto;
import com.example.rentProject.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @PostMapping("/create")
    public ClientAddressDto saveClient(@RequestBody ClientAddressDto clientAddressDto){
        return clientService.save(clientAddressDto);
    }

    @GetMapping("/list")
    public List<ClientDto> getClients(@RequestParam(defaultValue = "10") int rowsCount, @RequestParam(defaultValue = "1") int pageNumber){
        return clientService.getClients(rowsCount, pageNumber);
    }
}
