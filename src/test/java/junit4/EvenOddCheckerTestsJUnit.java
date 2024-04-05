package junit4;

import org.junit.Test;
import tested.EvenOddChecker;

import static org.junit.Assert.assertEquals;

public class EvenOddCheckerTestsJUnit {
    @Test
    public void evenOddCheckerTrue() {
        boolean bool = EvenOddChecker.check(12);
        assertEquals("division is not correct", true, bool);
    }

    @Test
    public void evenOddCheckerFalse() {
        boolean bool = EvenOddChecker.check(11);
        assertEquals("division is not correct", false, bool);
    }
}
