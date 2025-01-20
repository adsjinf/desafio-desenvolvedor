package br.com.oliveiratrust.apioliveiratrust.config;

import org.springframework.amqp.core.Declarable;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabnitMqConfig {

    public static final String FILAOLIVEIRATRUST_CREATED_QUEUE = "filaoliveiratrust";

    @Bean
    public Jackson2JsonMessageConverter jackson2JsonMessageConverter(){
        return  new Jackson2JsonMessageConverter();
    }

    @Bean
    public Declarable filaOliveiraTrust(){
        return new Queue(FILAOLIVEIRATRUST_CREATED_QUEUE);
    }
}
