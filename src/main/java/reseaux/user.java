package reseaux;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class user {
    private int id;
    private String pseudo;
    private LocalDate creation_date;
    private String email;

}
