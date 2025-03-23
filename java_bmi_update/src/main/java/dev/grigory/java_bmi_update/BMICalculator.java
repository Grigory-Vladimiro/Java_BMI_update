package dev.grigory.java_bmi_update;

public class BMICalculator {
    public static double calculateBMI(double weight, double height) {
        return Math.round((weight / (height * height)) * 100.0) / 100.0;
    }
}
