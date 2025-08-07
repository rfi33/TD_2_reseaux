package reseaux;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class Social {
    private List<Publication> publications = List.of();
    private List<User> users = List.of();


    public String searchPublication(String sentence) {
        if (sentence == null) {
            return "false";
        }

        for (Publication pub : publications) {
            if (pub.getDescription().equalsIgnoreCase(sentence)) {
                return pub.getDescription();
            }
        }
        return "none";
    }
}

