package com.example.rentProject.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ClientAddressDto {

    @JsonFormat(pattern = "client_id")
    Long id;
    String name;
    String lastName;
    String patronymic;
    String street;
    String house;
    int flat;
    int floor;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }
}
