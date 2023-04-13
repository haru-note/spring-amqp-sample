
package net.harunote.mynote.repository;

import net.harunote.mynote.entity.MyNoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyNoteRepository extends JpaRepository<MyNoteEntity, Long> {
}
