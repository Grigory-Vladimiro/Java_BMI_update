package dev.grigory.java_bmi_update;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    @Test
    public void testProcessUserInput_RealConsoleFlow() {
    String simulatedInput = "75\n1.75\n";
    System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

    ByteArrayOutputStream testOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(testOut));

    BMICalculatorApp.processUserInput();

    String output = testOut.toString();
    assertTrue(output.contains("Your BMI"));
    assertTrue(output.contains("Category:"));
    }
}
