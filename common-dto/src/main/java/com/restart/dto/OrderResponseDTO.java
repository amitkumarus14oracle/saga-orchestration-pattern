package com.restart.dto;

import com.restart.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponseDTO {
    private String orderId;
    private int productId;
    private int userId;
    private OrderStatus status;
    private double amount;
}
