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
    public static class MealMapper implements RowMapper<Meals> {
        @Override
        public Meals mapRow(ResultSet rs, int rowNum) throws SQLException {
            Meals meals = new Meals();
            meals.setId(rs.getInt("id"));
            meals.setMealType(rs.getString("mealType"));
            meals.setMealName(rs.getString("mealName"));
            meals.setCalories(rs.getInt("calories"));
            meals.setGramsProtein(rs.getString("gramsProtein"));
            meals.setGramsCarbs(rs.getString("gramsCarbs"));
            meals.setGramsFat(rs.getString("gramsFat"));
            meals.setTimeToCook(rs.getString("timeToCook"));
            return meals;
        }
    }
}





