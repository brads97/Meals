create table meals(
    id int NOT NULL auto_increment,
    meal_type varchar(255) NOT NULL,
    meal_name varchar(255) NOT NULL,
    calories int NOT NULL,
    grams_protein varchar(255) NOT NULL,
    grams_carbs varchar(255) NOT NULL,
    grams_fat varchar(255) NOT NULL,
    time_to_cook varchar(255) NOT NULL
);