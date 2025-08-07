package reseaux;

import java.time.LocalDate;

public class Administrator extends User{
    public Administrator(int id, String pseudo, LocalDate creation_date, String email) {
        super(id, pseudo, creation_date, email);
    }
}
