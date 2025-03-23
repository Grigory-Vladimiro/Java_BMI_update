package dev.grigory.java_bmi_update;

public class BMICalculatorApp {
    public static String processBMI(double weight, double height) {
    try {
        double bmi = BMICalculator.calculateBMI(weight, height);
        String category = BMICalculator.getBMICategory(bmi);
        return String.format("Your BMI: %.2f, Category: %s", bmi, category);
    } catch (IllegalArgumentException e) {
        return "Invalid input. Please enter valid numbers.";
        }
    }
}
