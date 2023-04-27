package BS.Meals.Repository;

import BS.Meals.User.Meals;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealsRepository extends JpaRepository <Meals, Integer> {
    List<Meals> findByMealNameContaining(String name);
    List<Meals> findByMealTypeAndMealNameContaining(String type, String name);
    List<Meals> findByMealTypeAndMealNameContainingIgnoreCaseAndCaloriesLessThanEqual(String type, String name, int calories);
}
