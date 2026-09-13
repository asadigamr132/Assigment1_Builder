package com.aitu.mealplan;

public class MealPlan {
    private final String name;
    private final int dailyCalories;
    private final int dailyProtein;
    private final int mealsPerDay;

    public MealPlan(
            String name,
            int dailyCalories,
            int dailyProtein,
            int mealsPerDay
    ){
        this.name = name;
        this.dailyCalories = dailyCalories;
        this.dailyProtein = dailyProtein;
        this.mealsPerDay = mealsPerDay;
    }
    @Override
    public String toString() {
        return "MealPlan{" +
                "name='" + name + '\'' +
                ", dailyCalories=" + dailyCalories +
                ", dailyProtein=" + dailyProtein +
                ", mealsPerDay=" + mealsPerDay +
                '}';
    }
}
