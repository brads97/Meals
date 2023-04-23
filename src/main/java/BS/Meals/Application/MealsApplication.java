package BS.Meals.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "BS.Meals")
@SpringBootApplication
public class MealsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MealsApplication.class, args);
	}

}

// Keep everything the same for the moment, jdbc.
// Maybe be able to add in a meal. Ignore  JPA for just now, make additional branch. Can work on JPA,
// connection to sql DB etc on other branches, show if necessary. Continue to work on adding additional funtionality

// to it up until interview, i.e. meals for the week and potentially joined tables.
