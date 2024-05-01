package com.restart.model;

import com.restart.enums.OrderStatus;
/*import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;*/
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/*import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.annotation.Id;*/

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Entity
//@Table(name = "PURCHASE_ORDER")
public class PurchaseOrder /*implements Persistable<String>*/ {
    //@Id
    //@Id
    //@GeneratedValue()
    private String id;
    private int productId;
    private int userId;
    private OrderStatus status;
    private double price;

    /*@Transient
    @Builder.Default
    private boolean isNewEntry = true;

    // This method checks if the record is new
    public boolean isNew() {
        return isNewEntry;
    }*/
}
