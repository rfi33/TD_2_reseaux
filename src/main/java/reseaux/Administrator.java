package reseaux;


import java.time.Instant;

public class Administrator extends User{
    public Administrator(int id, String pseudo, Instant creationDate, String email, Social social) {
        super(id, pseudo, creationDate, email, social);
    }
}
