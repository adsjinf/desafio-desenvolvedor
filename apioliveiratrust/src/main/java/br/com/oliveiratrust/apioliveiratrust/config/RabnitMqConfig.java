package br.com.oliveiratrust.apioliveiratrust.config;

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
}
