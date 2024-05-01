package com.restart.config;

import com.restart.dto.OrchestratorRequestDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Sinks;

@Configuration
public class OrderConfig {

    @Bean
    public Sinks.Many<OrchestratorRequestDTO> sink(){
        return Sinks.many().unicast().onBackpressureBuffer();
    }

    @Bean
    public Flux<OrchestratorRequestDTO> flux(Sinks.Many<OrchestratorRequestDTO> sink){
        return sink.asFlux();
    }

   /* @Bean
    public DirectProcessor<OrchestratorRequestDTO> orchestratorRequestDirectProcessor() {
        return DirectProcessor.create();
    }

    @Bean
    public FluxSink<OrchestratorRequestDTO> orchestratorRequestFluxSink() {
        return orchestratorRequestDirectProcessor().sink();
    }*/

}