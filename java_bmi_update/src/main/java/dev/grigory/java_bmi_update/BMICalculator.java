package dev.grigory.java_bmi_update;

public class BMICalculator {
    public static double calculateBMI(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be greater than zero.");
        }
        return Math.round((weight / (height * height)) * 100.0) / 100.0;
    }
}
