package net.harunote.amqp;

import net.harunote.amqp.pub.Publisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private final Publisher publisher;

    public LogController(Publisher publisher) {
        this.publisher = publisher;
    }

    @PostMapping("/log")
    public ResponseEntity<String> sendLog(@RequestBody String logMessage) {
        publisher.send(logMessage);
        return ResponseEntity.ok("로그 전송 성공");
    }
}