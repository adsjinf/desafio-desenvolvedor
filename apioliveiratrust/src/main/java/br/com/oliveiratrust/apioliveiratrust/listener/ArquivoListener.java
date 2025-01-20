package br.com.oliveiratrust.apioliveiratrust.listener;

import br.com.oliveiratrust.apioliveiratrust.listener.dto.OliveiraTrustCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static br.com.oliveiratrust.apioliveiratrust.config.RabnitMqConfig.FILAOLIVEIRATRUST_CREATED_QUEUE;

@Component
public class ArquivoListener {

    private final Logger logger = LoggerFactory.getLogger(ArquivoListener.class);

    @RabbitListener(queues = FILAOLIVEIRATRUST_CREATED_QUEUE)
    public void listen(Message<OliveiraTrustCreatedEvent> message){
        logger.info("message consulmed: {}", message);
    }
}
