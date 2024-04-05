package testng;

import org.testng.annotations.Test;
import org.testng.Assert;
import tested.Calculator;



public class CalculatorTestNG {
    private int result;

    @Test
    public void calculatorTestAdd() {
        Calculator calculator = new Calculator();
        result = calculator.add(0, 2);
        Assert.assertEquals(result, 2, "Sum failed");
    }

    @Test
    public void calculatorTestSubtract() {
        Calculator calculator = new Calculator();
        result = calculator.subtract(2, 2);
        Assert.assertEquals(result, 0, "Substraction incorrect");
    }

    @Test
    public void calculatorTestMultiply() {
        Calculator calculator = new Calculator();
        result = calculator.multiply(3, -3);
        Assert.assertEquals(result, -9, "Multiplication incorrect");
    }

    @Test
    public void calculatorTestDivide() {
        Calculator calculator = new Calculator();
        result = calculator.divide(12, 4);
        Assert.assertEquals(result,3,"Division incorrect");
    }
}
