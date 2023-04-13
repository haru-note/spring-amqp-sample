package net.harunote;

import net.harunote.message.Sender;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Date;

/**
 * @author CodeVillains
 */
@SpringBootApplication
@RabbitListener(queues = "TEST")
@EnableScheduling
public class RabbitMQApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitMQApplication.class, args);
    }

    @Bean
    public Sender sender() {
        return new Sender();
    }

    @Bean
    public Queue testQueue() {
        return new Queue("TEST");
    }

    @RabbitHandler
    public void process(@Payload String arg) {
        System.out.println(new Date() + ": " + arg);
    }
}
