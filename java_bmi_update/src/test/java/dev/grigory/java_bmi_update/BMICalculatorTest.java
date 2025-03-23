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
}
