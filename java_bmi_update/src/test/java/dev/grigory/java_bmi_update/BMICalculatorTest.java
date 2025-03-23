package dev.grigory.java_bmi_update;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BMICalculatorTest {
    @Test
    public void testCalculateBMI_NormalCase() {
    assertEquals(24.49, BMICalculator.calculateBMI(75, 1.75), 0.01);
    }
    @Test
    public void testCalculateBMI_InvalidInput() {
    assertThrows(IllegalArgumentException.class, () -> BMICalculator.calculateBMI(-10, 1.75));
    }
    @Test
    public void testGetBMICategory_Normal() {
    assertEquals("Normal weight", BMICalculator.getBMICategory(22.0));
    }
    @Test
    public void testGetBMICategory_ObeseI() {
    assertEquals("Obesity class I", BMICalculator.getBMICategory(32.0));
    }
    @Test
    public void testAllBMICategories() {
    assertEquals("Severe Thinness", BMICalculator.getBMICategory(15.0));
    assertEquals("Moderate Thinness", BMICalculator.getBMICategory(16.5));
    assertEquals("Mild Thinness", BMICalculator.getBMICategory(18.0));
    assertEquals("Normal weight", BMICalculator.getBMICategory(22.0));
    assertEquals("Overweight", BMICalculator.getBMICategory(27.0));
    assertEquals("Obesity class I", BMICalculator.getBMICategory(32.0));
    assertEquals("Obesity class II", BMICalculator.getBMICategory(37.0));
    assertEquals("Obesity class III", BMICalculator.getBMICategory(45.0));
    }
}
