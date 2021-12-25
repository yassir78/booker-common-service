package com.example.bookercommonservice.rest;


import com.example.bookercommonservice.dto.CustomerOrderDto;
import com.example.bookercommonservice.service.FactureService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pdf")
@RequiredArgsConstructor
public class FactureRest {
    private final FactureService factureService;

    @PostMapping("/")
    public String generateFacture(@RequestBody CustomerOrderDto customerOrderDto) {
        return factureService.generateFacture(customerOrderDto);
    }

}
