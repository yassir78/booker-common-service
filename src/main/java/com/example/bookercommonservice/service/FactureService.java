package com.example.bookercommonservice.service;

import com.example.bookercommonservice.dto.CustomerOrderDto;

public interface FactureService {
    String generateFacture(CustomerOrderDto customerOrderDto);
}
