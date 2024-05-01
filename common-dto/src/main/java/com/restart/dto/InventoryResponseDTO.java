package com.restart.dto;

import com.restart.enums.InventoryStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryResponseDTO {
    private int userId;
    private String orderId;
    private int productId;
    private InventoryStatus status;
}
