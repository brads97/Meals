package BS.Meals.Service;

import BS.Meals.User.Meals;
//import BS.Meals.Repository.MealsRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Service
//public class MealsService {
//    private final MealsRepository mealsRepository;
//
//    public MealsService(MealsRepository mealsRepository) {
//        this.mealsRepository = mealsRepository;
//    }
//
//    public List<Meals> allMeals() {
//        return mealsRepository.findAll();
//    }
//
//    public List<Meals> chickenMeals() {
//        return mealsRepository.findByMealNameContaining("Chicken");
//
//    }
//
//    public List<Meals> lunchBeefMeal() {
//        return mealsRepository.findByMealTypeAndMealNameContaining("Lunch", "Beef");
//    }
//}




//    public List<Meals> breakfastMeal() {
//        return mealsRepository.findByMealTypeAndMealNameContainingIgnoreCaseAndCaloriesLessThanEqual("Breakfast","Egg",350);
//    }
//
//    public Map<String, Long> mealCount() {
//        Map<String, Long> countMap = new HashMap<>();
//        countMap.put("chicken", mealsRepository.countByMealNameContainingIgnoreCase("chicken"));
//        countMap.put("beef", mealsRepository.countByMealNameContainingIgnoreCase("beef"));
//        return countMap;
//    }
//    public Map<String, Long> mealDinnerCount() {
//        Map<String, Long> countMap = new HashMap<>();
//        countMap.put("Dinner - chicken", mealsRepository.countByMealTypeAndMealNameContainingIgnoreCase("Dinner","chicken"));
//        countMap.put("Dinner - beef", mealsRepository.countByMealTypeAndMealNameContainingIgnoreCase("Dinner", "beef"));
//        return countMap;
//    }
//
//    public List<Meals> getUserMeal(String mealType, String mealName) {
//        return mealsRepository.findByMealTypeAndMealNameContaining(mealType,mealName);
//    }

