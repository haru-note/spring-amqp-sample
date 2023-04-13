package net.harunote.message;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author CodeVillains
 */
public class Sender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Scheduled(fixedDelay = 1000L)
    public void send() {
        this.rabbitTemplate.convertAndSend("TEST","Hello World!");
    }
}
