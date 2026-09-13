package com.aitu.mealplan;

public class MuscleGainMealPlanBuilder
        implements MealPlanBuilder {
    private String name;
    private int dailyCalories;
    private int dailyProtein;
    private int mealsPerDay;

    @Override
    public MealPlanBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public MealPlanBuilder setDailyCalories(int calories) {
        this.dailyCalories =calories;
        return this;
    }

    @Override
    public MealPlanBuilder setDailyProtein(int protein) {
        this.dailyProtein = protein;
        return this;
    }

    @Override
    public MealPlanBuilder setMealsPerDay(int meals) {
        this.mealsPerDay = meals;
        return this;
    }

    @Override
    public MealPlan build() {
        return new MealPlan(
                name,
                dailyCalories,
                dailyProtein,
                mealsPerDay
        );
    }
}