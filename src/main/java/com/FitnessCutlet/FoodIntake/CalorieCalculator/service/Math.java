package com.FitnessCutlet.FoodIntake.CalorieCalculator.service;

import com.FitnessCutlet.FoodIntake.CalorieCalculator.model.UserData;

public class Math {
    Bmr bmr;
    UserData userData;
    
    public Math(UserData userData) {
        this.userData = userData;
        bmr = new Bmr(userData);
    }
    
    public double getDailyCalorieIntake() {
        double a = bmr.getBMR();
        double b = userData.getFitnessLevel();
        return a * b;
    }
}
