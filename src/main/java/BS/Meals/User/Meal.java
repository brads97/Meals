package BS.Meals.User;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "meals")
public class Meal {
    @Id
    private long id;
    private String mealType;
    private String mealName;
    private int calories;
    private String gramsProtein;
    private String gramsCarbs;
    private String gramsFat;
    private String timeToCook;
}
