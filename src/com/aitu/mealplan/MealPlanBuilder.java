package com.aitu.mealplan;

public interface MealPlanBuilder {
    MealPlanBuilder setName(String name);

    MealPlanBuilder setDailyCalories(int calories);

    MealPlanBuilder setDailyProtein(int protein);

    MealPlanBuilder setMealsPerDay(int meals);

    MealPlan build();
}
