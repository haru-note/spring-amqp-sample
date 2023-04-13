package net.harunote.mynote.controller;

import net.harunote.mynote.service.MyNoteService;
import lombok.extern.slf4j.Slf4j;
import net.harunote.mynote.entity.MyNoteEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CodeVillains
 */
@Slf4j
@RestController
public class MyNoteController {

    private MyNoteService myNoteService;

    public MyNoteController(MyNoteService myNoteService) {
        this.myNoteService = myNoteService;
    }

    @GetMapping("/hello")
    public String getHello() {
        String helloWorld = "hello world";
        System.out.println(helloWorld);

        return helloWorld;
    }

    @GetMapping("/mynote/{id}")
    ResponseEntity<MyNoteEntity> getNote(@PathVariable Long id) {
        log.info("# mynote getAll()");
        MyNoteEntity entity = myNoteService.findById(id);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

}
