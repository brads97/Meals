package BS.Meals.Controller;

import BS.Meals.Service.MealsService;
import BS.Meals.User.Meals;
import BS.Meals.User.UserMealRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meal-plan")
public class MealsController {

    @Autowired
    public MealsController(final MealsService mealsService) {
        this.mealsService = mealsService;
    }

    private final MealsService mealsService;

    @GetMapping("/all-meals")
    public List<Meals> getAllMeals() {
        return mealsService.getAllMeals();
    }

    @GetMapping("/chicken")
    public List<Meals> test() {
        return mealsService.getChickenMeals();
    }

    @PostMapping("/customMeal")
    public List<Meals> postMealPlan(@RequestBody UserMealRequest request) {
        return mealsService.postMealPlan(request.getPreferredFoodBreakfast(), request.getPreferredFoodLunch(), request.getPreferredFoodDinner(), request.getCalories());
    }
}

