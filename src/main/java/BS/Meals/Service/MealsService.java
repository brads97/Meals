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
    // Creating new object parameter jdbcTemplate, which provides utility in mapping the results of queries to java objects.
    // Created the constructor for the MealsManager class to then use JdbcTemplate object to execute queries and update statements against the database.
    // Final keyword meaning that it cannot be reassigned within the constructor.
    JdbcTemplate jdbcTemplate;

    @Autowired // Not required when just one constructor, simply for understanding.
    public MealsService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    // The jdbcTemplate.query method takes two parameters, an SQL query and a rowmapper object. The row mapper object passed to the query method in this case, is an instance of the MealMapper class, which implements row mapper
    // and maps each row of the result set to a car object.
    // The query method returns a list of Car objects that represent the rows in the cars table. This list is returned by the getAll method.

    public List<Meals> getAllMeals() {
        return jdbcTemplate.query("SELECT * FROM meals", new MealsManager.MealMapper());
    }
 // remove get(0) to return all for each mealType. or getRandom for random, look at making get unique for a week.
    public Meals getMealsByUserRequest(String mealType, String preferredFood, int calories) {
        String sql = "SELECT * FROM meals WHERE mealType = ? AND mealName LIKE ? AND calories <= ?";
        return jdbcTemplate.query(sql, new Object[]{mealType, "%" + preferredFood + "%", calories}, new MealsManager.MealMapper()).get(0);
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

    // Could alternatively put these inputs into a List<String> foodTypes to shorten it, and access via .contains(foodTypes.get(0)) etc.
    public List<Meals> postMealPlan(String breakfastFood, String lunchFood, String dinnerFood, Integer calories) {
        int caloriesPerMeal = calories / 3;

        List<Meals> dayMeals = new ArrayList<>();
//        List<String> mealNames = List.of("Breakfast", "Lunch", "Dinner");
//
//        mealNames.forEach(meal -> getMealsByUserRequest(meal, breakfastFood, caloriesPerMeal));

        dayMeals.add(getMealsByUserRequest("Breakfast", breakfastFood, caloriesPerMeal));
        dayMeals.add(getMealsByUserRequest("Lunch", lunchFood, caloriesPerMeal));
        dayMeals.add(getMealsByUserRequest("Dinner", dinnerFood, caloriesPerMeal));

        return dayMeals;
    }
}

//    List<Meals> filteredMeals = new ArrayList<>();
//
//        // Filter breakfast meals with eggs and under 400 calories
//        for (Meals meal : getAllMeals()) {
//            if (meal.getMealType().equals("Breakfast") &&
//                    meal.getMealName().contains("Eggs") &&
//                    meal.getCalories() < 400) {
//                filteredMeals.add(meal);
//                break;
//            }
//        }
//            // Filter lunch meals with chicken and 800 calories or less
//        for (Meals meal : getAllMeals()) {
//            if (meal.getMealType().equals("Lunch") &&
//                    meal.getMealName().contains("Chicken") &&
//                    meal.getCalories() < 800) {
//                filteredMeals.add(meal);
//                break;
//            }
//        }
//           // Filter dinner meals with beef or chicken and 800 calories or less
//        for (Meals meal : getAllMeals()) {
//            if (meal.getMealType().equals("Dinner") &&
//                    (meal.getMealName().contains("Beef") || meal.getMealName().contains("Chicken")) &&
//                    meal.getCalories() <= 800) {
//                filteredMeals.add(meal);
//                break;
//            }
//        }
//            return filteredMeals;
//        }

