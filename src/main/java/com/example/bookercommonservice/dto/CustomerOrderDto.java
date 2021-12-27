package com.example.bookercommonservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class CustomerOrderDto {
    private Long id;
    private String ref;
    private String shipToAddress;
    private LocalDate orderDate;
    private LocalDate shipToDate;
    private String sellerRef;
    private String buyerRef;
    private BigDecimal orderAmount;
    private BigDecimal totalPaid;
    private OrderStatusDto status;
    private List<OrderItemDto> orderItemDtos;
}
