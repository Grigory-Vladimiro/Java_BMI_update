package dev.grigory.java_bmi_update;

public class BMICalculator {
    public static double calculateBMI(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be greater than zero.");
        }
        return Math.round((weight / (height * height)) * 100.0) / 100.0;
    }
    public static String getBMICategory(double bmi) {
        if (bmi < 16) return "Severe Thinness";
        if (bmi < 17) return "Moderate Thinness";
        if (bmi < 18.5) return "Mild Thinness";
        if (bmi < 25) return "Normal weight";
        if (bmi < 30) return "Overweight";
        if (bmi < 35) return "Obesity class I";
        if (bmi < 40) return "Obesity class II";
        return "Obesity class III";
    }
}
