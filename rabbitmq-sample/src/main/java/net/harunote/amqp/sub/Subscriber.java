package net.harunote.amqp.sub;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Subscriber {
    @RabbitListener(queues = "myQueue")
    public void receive(String message) {
        System.out.println("Received message: " + message);
    }

}