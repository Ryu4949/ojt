package security.spring_security_practice.note.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteRegisterDto {

    private String title;
    private String content;
}
