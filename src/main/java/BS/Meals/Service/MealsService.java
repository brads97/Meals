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

    public List<Meals> getChickenMeals() {
        List<Meals> mealsList = new ArrayList<>();
        for (Meals meal : getAllMeals()) {
            if (meal.getMealName().contains("Chicken")) {
                mealsList.add(meal);
            }
        }
        return mealsList;

    }

    public List<Meals> postMealPlan(String breakfastFoodType, String lunchFoodType, String dinnerFoodType1, String dinnerFoodType2) {

        List<Meals> filteredMeals = new ArrayList<>();

        boolean foundBreakfast = false;
        boolean foundLunch = false;
        boolean foundDinner = false;

        for (Meals meal : getAllMeals()) {
            if (!foundBreakfast && meal.getMealType().equals("Breakfast") && meal.getMealName().contains(breakfastFoodType) && meal.getCalories() < 400) {
                filteredMeals.add(meal);
                foundBreakfast = true;
            } else if (!foundLunch && meal.getMealType().equals("Lunch") && meal.getMealName().contains(lunchFoodType) && meal.getCalories() < 800) {
                filteredMeals.add(meal);
                foundLunch = true;
            } else if (!foundDinner && meal.getMealType().equals("Dinner") && (meal.getMealName().contains(dinnerFoodType1) || meal.getMealName().contains(dinnerFoodType2)) && meal.getCalories() <= 800) {
                filteredMeals.add(meal);
                foundDinner = true;
            }
            if (foundBreakfast && foundLunch && foundDinner) {
                break;
            }
        }
        return filteredMeals;
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

