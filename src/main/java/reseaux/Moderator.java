package reseaux;

import java.time.Instant;

public class Moderator extends User {
    public Moderator(int id, String pseudo, Instant creationDate, String email, Social social) {
        super(id, pseudo, creationDate, email, social);
    }
}

