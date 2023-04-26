package BS.Meals;

import jakarta.persistence.*;

@Entity
public class Meals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String mealType;
    private String mealName;
    private int calories;
    private String gramsProtein;
    private String gramsCarbs;
    private String gramsFat;
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

    @Override
    public String toString() {
        return "Meals{" +
                "id=" + id +
                ", mealType='" + mealType + '\'' +
                ", mealName='" + mealName + '\'' +
                ", calories=" + calories +
                ", gramsProtein='" + gramsProtein + '\'' +
                ", gramsCarbs='" + gramsCarbs + '\'' +
                ", gramsFat='" + gramsFat + '\'' +
                ", timeToCook='" + timeToCook + '\'' +
                '}';
    }
}


