package junit4;

import org.junit.Test;
import tested.Calculator;

import static junit.framework.TestCase.assertEquals;


public class CalculatorTestsJUnit {
    private int result;

    @Test
    public void calculatorTestAdd() {
        Calculator calculator = new Calculator();
        result = calculator.add(0, 2);
        assertEquals("Sum incorrect", 2, result);
    }

    @Test
    public void calculatorTestSubtract() {
        Calculator calculator = new Calculator();
        result = calculator.subtract(2, 2);
        assertEquals("Substraction incorrect", 0, result);
    }

    @Test
    public void calculatorTestMultiply() {
        Calculator calculator = new Calculator();
        result = calculator.multiply(3, -3);
        assertEquals("Multiply incorrect", -9, result);
    }

    @Test
    public void calculatorTestDivide() {
        Calculator calculator = new Calculator();
        result = calculator.divide(12, 4);
        assertEquals("Division incorrect", 3, result);
    }

}
