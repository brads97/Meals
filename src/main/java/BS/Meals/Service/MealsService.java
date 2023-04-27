package BS.Meals.Service;

import BS.Meals.User.Meals;
import BS.Meals.Repository.MealsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MealsService {
    private final MealsRepository mealsRepository;

    public MealsService(MealsRepository mealsRepository) {
        this.mealsRepository = mealsRepository;
    }
    public List<Meals> allMeals() {
        return mealsRepository.findAll();
    }
    public List<Meals> chickenMeals() {
        return mealsRepository.findByMealNameContaining("Chicken");

    }
    public List<Meals> lunchBeefMeal() {
        return mealsRepository.findByMealTypeAndMealNameContaining("Lunch","Beef");

    }public List<Meals> breakfastMeal() {
        return mealsRepository.findByMealTypeAndMealNameContainingIgnoreCaseAndCaloriesLessThanEqual("Lunch","Egg",350);

    }
}
