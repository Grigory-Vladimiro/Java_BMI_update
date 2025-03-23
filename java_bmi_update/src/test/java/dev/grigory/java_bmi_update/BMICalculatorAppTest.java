package dev.grigory.java_bmi_update;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BMICalculatorAppTest {
@Test
public void testProcessBMI_Normal() {
    String result = BMICalculatorApp.processBMI(70, 1.75);
    assertTrue(result.contains("Normal weight"));
}
}
