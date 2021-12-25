package com.example.bookercommonservice.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDto {
    private Long id;
    private Integer quantity;
    private BigDecimal total;
    private String productRef;
    private CustomerOrderDto relatedCustomerOrderDto;
}
