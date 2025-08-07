package reseaux;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Publication {
    private int id;
    private String titre;
    private String description;
    private User author;

}
