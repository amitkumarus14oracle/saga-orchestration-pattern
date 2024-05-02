package com.restart.eventhandlers;

import com.restart.dto.OrchestratorRequestDTO;
import com.restart.dto.OrchestratorResponseDTO;
import com.restart.service.OrderEventUpdateService;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class OrderEventHandler {

    @Autowired
    private Flux<OrchestratorRequestDTO> flux;

    @Autowired
    private OrderEventUpdateService service;

    @Bean
    public Supplier<Flux<OrchestratorRequestDTO>> supplier(){
        return      () -> flux;
    };

    @Bean
    public Consumer<Flux<OrchestratorResponseDTO>> consumer(){
        return f -> f
                .doOnNext(c -> System.out.println("Consuming :: " + c))
                .flatMap(responseDTO -> this.service.updateOrder(responseDTO))
                .subscribe();
    }

    /*@Bean
    public Function<KStream<String, OrchestratorRequestDTO>, KStream<String, OrchestratorRequestDTO>> domainProcessor() {
        return kstream -> kstream.filter((key, domain) -> {
            if(domain.getOrderId() == null ) {
                System.out.println("Inactive Domain: "+ domain.getAmount());
            } else {
                System.out.println("Active Domain");
            }
            return !(domain.getOrderId() == null);
        });
    }*/

}