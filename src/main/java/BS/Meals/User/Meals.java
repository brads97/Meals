package BS.Meals.User;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "meals")
public class Meals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "meal_type")
    private String mealType;

    @Column(name = "meal_name")
    private String mealName;

    @Column(name = "calories")
    private int calories;

    @Column(name = "grams_protein")
    private String gramsProtein;

    @Column(name = "grams_carbs")
    private String gramsCarbs;

    @Column(name = "grams_fat")
    private String gramsFat;

    @Column(name = "time_to_cook")
    private String timeToCook;
}


