package BS.Meals.Repository;

import BS.Meals.User.Meal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MealsMongoRepo extends MongoRepository<Meal,Integer> {
}
