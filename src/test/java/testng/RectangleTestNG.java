package testng;

import org.junit.Test;
import org.testng.Assert;
import tested.Rectangle;


public class RectangleTestNG {
    private double rectangleLength = 12.22;
    private double rectangleWidth = 2.33;
    private Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);

    @Test
    public void rectangleConstructorTest() {
        Assert.assertEquals(rectangle.getLength(),rectangleLength,"Incorrect length");
        Assert.assertEquals(rectangle.getWidth(),rectangleWidth,"Incorrect width");
    }

    @Test
    public void rectangleGetAreaTest() {
        Assert.assertEquals(rectangle.getLength() * rectangle.getWidth(),rectangleLength * rectangleWidth,"Area calculation incorrect");
    }

    @Test
    public void rectangleSetLengthTest() {
        rectangle.setLength(rectangleLength);
        Assert.assertEquals(rectangle.getLength(),rectangleLength,"SetLength incorrect");
        Assert.assertEquals(rectangle.getWidth(),rectangleWidth,"SetWidth incorrect");
    }
}
