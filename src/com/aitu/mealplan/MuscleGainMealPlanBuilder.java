package com.aitu.mealplan;

public class MuscleGainMealPlanBuilder
        implements MealPlanBuilder {
    private String name;
    private String goal;
    private int dailyCalories;
    private int dailyProtein;
    private int mealsPerDay;

    @Override
    public MealPlanBuilder setName(String name) {
        this.name = name;
        return this;
    }
    @Override
    public MealPlanBuilder setGoal(String goal) {
        this.goal = goal;
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

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (dailyCalories <= 0) {
            throw new IllegalArgumentException(
                    "Daily calories must be greater than 0"
            );
        }

        if (dailyProtein <= 0) {
            throw new IllegalArgumentException(
                    "Daily protein must be greater than 0"
            );
        }

        if (mealsPerDay <= 0) {
            throw new IllegalArgumentException(
                    "Meals per day must be greater than 0"
            );
        }

        return new MealPlan(
                name,
                goal,
                dailyCalories,
                dailyProtein,
                mealsPerDay
        );
    }

}