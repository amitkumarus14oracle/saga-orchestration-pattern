package com.restart.dto;

import com.restart.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrchestratorResponseDTO implements Serializable {
    private String orderId;
    private int productId;
    private int userId;
    private double amount;
    private OrderStatus status;
}
