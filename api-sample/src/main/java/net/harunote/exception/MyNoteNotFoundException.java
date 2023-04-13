package net.harunote.exception;

/**
 * @author CodeVillains
 */
public class MyNoteNotFoundException extends RuntimeException {
    public MyNoteNotFoundException(Long id) {
        super("My Note가 존재하지 않습니다. id = " + id);
    }
}
