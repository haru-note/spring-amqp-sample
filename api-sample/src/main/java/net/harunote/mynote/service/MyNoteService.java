package net.harunote.mynote.service;

import net.harunote.exception.MyNoteNotFoundException;
import lombok.extern.slf4j.Slf4j;

import net.harunote.mynote.entity.MyNoteEntity;
import net.harunote.mynote.repository.MyNoteRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyNoteService {

    private final MyNoteRepository myNoteRepository;

    public MyNoteService(MyNoteRepository myNoteRepository) {
        this.myNoteRepository = myNoteRepository;
    }

    public MyNoteEntity findById(Long id) {
        return myNoteRepository.findById(id).orElseThrow(() -> new MyNoteNotFoundException(id));
    }

}