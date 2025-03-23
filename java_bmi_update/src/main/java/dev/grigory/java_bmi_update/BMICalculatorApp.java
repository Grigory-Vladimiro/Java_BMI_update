package dev.grigory.java_bmi_update;

import java.util.Scanner;

public class BMICalculatorApp {

    public static void main(String[] args) {
        processUserInput();
    }
    public static void processUserInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your weight in (kg):");
            double weight = scanner.nextDouble();

            System.out.println("Enter your height in (m):");
            double height = scanner.nextDouble();

            String result = processBMI(weight, height);
            System.out.println(result);
        } finally {
            scanner.close();
        }
    }
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
