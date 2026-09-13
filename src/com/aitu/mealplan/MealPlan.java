package com.aitu.mealplan;

public class MealPlan {
    private final String name;
    private final String goal;
    private final int dailyCalories;
    private final int dailyProtein;
    private final int mealsPerDay;

    public MealPlan(
            String name,
            String goal,
            int dailyCalories,
            int dailyProtein,
            int mealsPerDay
    ){
        this.name = name;
        this.goal = goal;
        this.dailyCalories = dailyCalories;
        this.dailyProtein = dailyProtein;
        this.mealsPerDay = mealsPerDay;
    }
    @Override
    public String toString() {
        return "MealPlan{" +
                "name='" + name + '\'' +
                ", goal='" + goal + '\'' +
                ", dailyCalories=" + dailyCalories +
                ", dailyProtein=" + dailyProtein +
                ", mealsPerDay=" + mealsPerDay +
                '}';
    }
}
