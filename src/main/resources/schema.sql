create table meals(
    id int NOT NULL auto_increment,
    mealType varchar(255) NOT NULL,
    mealName varchar(255) NOT NULL,
    calories int NOT NULL,
    gramsProtein varchar(255) NOT NULL,
    gramsCarbs varchar(255) NOT NULL,
    gramsFat varchar(255) NOT NULL,
    timeToCook varchar(255) NOT NULL
);