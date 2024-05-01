package com.restart.dto;

import com.restart.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponseDTO {
    private int userId;
    private String orderId;
    private double amount;
    private PaymentStatus status;
}
