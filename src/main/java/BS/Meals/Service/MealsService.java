package BS.Meals.Service;

import BS.Meals.Manager.MealsManager;
import BS.Meals.User.Meals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MealsService {

    JdbcTemplate jdbcTemplate;

    @Autowired //not required, since only one constructor.
    public MealsService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Meals> getAllMeals() {
        return jdbcTemplate.query("SELECT * FROM meals", new MealsManager.MealMapper());
    }

    public List<Meals> getChickenMeals() {
        List<Meals> mealsList = new ArrayList<>();
        for (Meals meal : getAllMeals()) {
            if (meal.getMealName().contains("Chicken")) {
                mealsList.add(meal);
            }
        }
        return mealsList;
    }

    public List<Meals> addMeal(Meals meal) {
        String sql = "INSERT INTO meals (mealType, mealName, calories, gramsProtein, gramsCarbs, gramsFat, timeToCook) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, meal.getMealType(), meal.getMealName(), meal.getCalories(),
                                    meal.getGramsProtein(), meal.getGramsCarbs(), meal.getGramsFat(), meal.getTimeToCook());
        return getAllMeals();
    }

    // get(0) returning first elements of the list matching the criteria.
    public Meals getMealsByUserRequest(String mealType, String preferredFood, int calories) {
        String sql = "SELECT * FROM meals WHERE mealType = ? AND mealName LIKE ? AND calories <= ?";
        return jdbcTemplate.query(sql, new Object[]{mealType, "%" + preferredFood + "%", calories}, new MealsManager.MealMapper()).get(0);
    }


    public List<Meals> postMealPlan(String breakfastFood, String lunchFood, String dinnerFood, Integer calories) {
        int caloriesPerMeal = calories / 3;

        List<Meals> dayMeals = new ArrayList<>();

        dayMeals.add(getMealsByUserRequest("Breakfast", breakfastFood, caloriesPerMeal));
        dayMeals.add(getMealsByUserRequest("Lunch", lunchFood, caloriesPerMeal));
        dayMeals.add(getMealsByUserRequest("Dinner", dinnerFood, caloriesPerMeal));

        return dayMeals;
    }
}

