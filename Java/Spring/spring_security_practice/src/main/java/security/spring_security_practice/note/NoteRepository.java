package security.spring_security_practice.note;

import org.springframework.data.jpa.repository.JpaRepository;
import security.spring_security_practice.note.entity.Note;
import security.spring_security_practice.user.entity.User;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

    List<Note> findByUserOrderByIdDesc(User user);

    Note findByIdAndUser(Long id, User user);
}