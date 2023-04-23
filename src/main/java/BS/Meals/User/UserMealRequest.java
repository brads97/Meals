package BS.Meals.User;

public class UserMealRequest {

    public String getPreferredFoodBreakfast() {
        return preferredFoodBreakfast;
    }

    public void setPreferredFoodBreakfast(String preferredFoodBreakfast) {
        this.preferredFoodBreakfast = preferredFoodBreakfast;
    }

    public String getPreferredFoodLunch() {
        return preferredFoodLunch;
    }

    public void setPreferredFoodLunch(String preferredFoodLunch) {
        this.preferredFoodLunch = preferredFoodLunch;
    }

    public String getPreferredFoodDinner() {
        return preferredFoodDinner;
    }

    public void setPreferredFoodDinner(String preferredFoodDinner) {
        this.preferredFoodDinner = preferredFoodDinner;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    private String preferredFoodBreakfast;
    private String preferredFoodLunch;
    private String preferredFoodDinner;
    private Integer calories;

}
