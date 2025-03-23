package dev.grigory.java_bmi_update;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BMICalculatorAppTest {
    @Test
    public void testProcessBMI_Normal() {
    String result = BMICalculatorApp.processBMI(70, 1.75);
    assertTrue(result.contains("Normal weight"));
    }
    @Test
    public void testProcessBMI_InvalidInput() {
    String result = BMICalculatorApp.processBMI(-10, 1.75);
    assertEquals("Invalid input. Please enter valid numbers.", result);
    }
}
