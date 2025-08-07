package reseaux;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor

public class User {
    private int id;
    private String pseudo;
    private LocalDate creationDate;
    private String email;

}
