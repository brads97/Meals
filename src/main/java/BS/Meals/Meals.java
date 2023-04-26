package BS.Meals;

import jakarta.persistence.*;

@Entity
@Table(name = "meals")
public class Meals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "mealType")
    private String mealType;
    @Column(name = "mealName")
    private String mealName;
    @Column(name = "calories")
    private int calories;
    @Column(name = "gramsProtein")
    private String gramsProtein;
    @Column(name = "gramsCarbs")
    private String gramsCarbs;
    @Column(name = "gramsFat")
    private String gramsFat;
    @Column(name = "timeToCook")
    private String timeToCook;

    public Meals() {
    }

    public Meals(String mealType, String mealName, int calories, String gramsProtein, String gramsCarbs, String gramsFat, String timeToCook) {
        this.mealType = mealType;
        this.mealName = mealName;
        this.calories = calories;
        this.gramsProtein = gramsProtein;
        this.gramsCarbs = gramsCarbs;
        this.gramsFat = gramsFat;
        this.timeToCook = timeToCook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getGramsProtein() {
        return gramsProtein;
    }

    public void setGramsProtein(String gramsProtein) {
        this.gramsProtein = gramsProtein;
    }

    public String getGramsCarbs() {
        return gramsCarbs;
    }

    public void setGramsCarbs(String gramsCarbs) {
        this.gramsCarbs = gramsCarbs;
    }

    public String getGramsFat() {
        return gramsFat;
    }

    public void setGramsFat(String gramsFat) {
        this.gramsFat = gramsFat;
    }

    public String getTimeToCook() {
        return timeToCook;
    }

    public void setTimeToCook(String timeToCook) {
        this.timeToCook = timeToCook;
    }

}


