package BS.Meals.Manager;

import BS.Meals.User.Meals;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MealsManager {

    // The MealMapper class implements the interface RowMapper. These are mapped to the Meals object.
    // When the mapRow method of the MealMapper class is called, the "ResultSet rs" is a PreparedStatement object which when it is called, a query is sent to the database management system. (our sql files)
    // This info is then read in. So if it reads a VARCHAR, then we can use getString method to return the value for that column.
    class MealMapper implements RowMapper<Meals> {
        @Override
        public Meals mapRow(ResultSet rs, int rowNum) throws SQLException {
            Meals meals = new Meals();
            meals.setId(rs.getInt("id"));
            meals.setMealName(rs.getString("mealName"));
            meals.setCalories(rs.getInt("calories"));
            meals.setGramsProtein(rs.getString("gramsProtein"));
            meals.setGramsCarbs(rs.getString("gramsCarbs"));
            meals.setGramsFat(rs.getString("gramsFat"));
            meals.setTimeToCook(rs.getString("timeToCook"));
            return meals;
        }
    }

    // Creating new object parameter jdbcTemplate, which provides utility in mapping the results of queries to java objects.
    // Created the constructor for the MealsManager class to then use JdbcTemplate object to execute queries and update statements against the database.
    // Final keyword meaning that it cannot be reassigned within the constructor.
    JdbcTemplate jdbcTemplate;

    public MealsManager(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Creating and initialising a list of Meals objects.
    private List<Meals> mealsList = new ArrayList<>();

    // The jdbcTemplate.query method takes two parameters, an SQL query and a rowmapper object. The row mapper object passed to the query method in this case, is an instance of the MealMapper class, which implements row mapper
    // and maps each row of the result set to a car object.
    // The query method returns a list of Car objects that represent the rows in the cars table. This list is returned by the getAll method.

    public List<Meals> getNumberOfMeals() {
        return jdbcTemplate.query("SELECT * FROM meals", new MealMapper());

    }
}




