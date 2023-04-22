package BS.Meals.Controller;

import BS.Meals.Manager.MealsManager;
import BS.Meals.Service.MealsService;
import BS.Meals.User.Meals;
import BS.Meals.User.UserRequest;
import ch.qos.logback.core.model.Model;
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

    @PostMapping
    public List<Meals> postMealPlan(@RequestBody UserRequest request) {
        return mealsService.postMealPlan(request.getBreakfastFoodType(),request.getLunchFoodType(),request.getDinnerFoodType1(),request.getDinnerFoodType2());
    }
}

