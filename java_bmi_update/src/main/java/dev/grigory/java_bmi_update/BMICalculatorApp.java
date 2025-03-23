package dev.grigory.java_bmi_update;

import java.util.Scanner;

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
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter weight (kg): ");
    double weight = scanner.nextDouble();
    System.out.print("Enter height (m): ");
    double height = scanner.nextDouble();
    System.out.println(processBMI(weight, height));
    scanner.close();
    }
}
