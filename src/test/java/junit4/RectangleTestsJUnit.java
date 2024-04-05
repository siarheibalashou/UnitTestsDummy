package junit4;

import org.junit.Test;
import tested.Rectangle;

import static junit.framework.TestCase.assertEquals;

public class RectangleTestsJUnit {
    private double rectangleLength = 12.22;
    private double rectangleWidth = 2.33;
    private Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);

    @Test
    public void rectangleConstructorTest() {
        assertEquals("Incorrect length", rectangleLength, rectangle.getLength());
        assertEquals("Incorrect width", rectangleWidth, rectangle.getWidth());
    }

    @Test
    public void rectangleGetAreaTest() {
        assertEquals("Area calculation incorrect", rectangleLength * rectangleWidth, rectangle.getLength() * rectangle.getWidth());
    }

    @Test
    public void rectangleSetLengthTest() {
        rectangle.setLength(rectangleLength);
        assertEquals("SetLength incorrect", rectangleLength, rectangle.getLength());
        assertEquals("SetWidth incorrect", rectangleWidth, rectangle.getWidth());
    }

}
