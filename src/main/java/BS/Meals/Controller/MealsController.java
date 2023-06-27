package BS.Meals.Controller;

import BS.Meals.User.Meals;
//import BS.Meals.Service.MealsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//@RestController
//@RequestMapping("/meals")
//public class MealsController {
//
//    private final MealsService mealsService;
//
//    @Autowired
//    public MealsController(MealsService mealsService) {
//        this.mealsService = mealsService;
//    }
//
//    @GetMapping
//    public List<Meals> getAllMeals() {
//        return mealsService.allMeals();
//    }
//
//    @GetMapping("/chicken")
//    public List<Meals> chickenMeals() {
//        return mealsService.chickenMeals();
//    }
//
//    @GetMapping("/lunch")
//    public List<Meals> lunchBeefMeal() {
//        return mealsService.lunchBeefMeal();
//    }
//}


//    @GetMapping("/breakfast")
//    public List<Meals> breakfastMeal() {
//        return mealsService.breakfastMeal();
//    }
//    @GetMapping("/mealcount")
//    public Map<String, Long> mealCount() {
//        return mealsService.mealCount();
//    }
//    @GetMapping("/dinnercount")
//    public Map<String, Long> mealDinnerCount() {
//        return mealsService.mealDinnerCount();
//    }
//    @PostMapping("/userMeal")
//    public List<Meals> userMeal(@RequestBody Meals userMeal) {
//        return mealsService.getUserMeal(userMeal.getMealType(), userMeal.getMealName());
//    }

