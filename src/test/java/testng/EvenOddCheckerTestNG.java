package testng;

import org.testng.annotations.Test;
import org.testng.Assert;
import tested.EvenOddChecker;


public class EvenOddCheckerTestNG {
    @Test
    public void evenOddCheckerTrue() {
        boolean bool = EvenOddChecker.check(12);
        Assert.assertEquals(bool, true,"division is not correct");
    }

    @Test
    public void evenOddCheckerFalse() {
        boolean bool = EvenOddChecker.check(11);
        Assert.assertEquals(bool, false,"division is not correct");
    }
}
