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
}
