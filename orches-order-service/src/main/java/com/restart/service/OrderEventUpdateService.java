package com.restart.service;

import com.restart.dto.OrchestratorResponseDTO;
import com.restart.model.PurchaseOrder;
//import com.restart.repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class OrderEventUpdateService {

    /*@Autowired
    private PurchaseOrderRepository repository;*/

    public Mono<Void> updateOrder(final OrchestratorResponseDTO responseDTO){
        return //this.repository.findById(responseDTO.getOrderId())
                Mono.just(new PurchaseOrder())
                .doOnNext(p -> p.setStatus(responseDTO.getStatus()))
                //.flatMap(this.repository::save)
                .then();
    }

}