package com.rohith.FitnessCutlet.service;

import com.rohith.FitnessCutlet.api.model.UserData;

public class Math {
    Bmr bmr;
    UserData userData;
    
    public Math(UserData userData) {
        this.userData = userData;
        bmr = new Bmr(userData);
    }
    
    public double getDailyCalorieIntake() {
        double result = 0;
        double a = bmr.getBMR();
        double b = userData.getFitnessLevel();
        result = a * b;
        return result;
    }
}
