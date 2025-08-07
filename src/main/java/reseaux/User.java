package reseaux;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor

public class User {
    private int id;
    private String pseudo;
    private Instant creationDate;
    private String email;
    private Social social;


}
