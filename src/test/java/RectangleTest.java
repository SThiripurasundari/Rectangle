import Rectangle.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RectangleTest {

    @Test
    void checkForArea20ForLength4andWidth5() {

        Rectangle rectangle = new Rectangle(4,5);

        Assertions.assertEquals(20, rectangle.area());

    }

    @Test
    void checkForArea16ForLength4AndWidth4() {

        Rectangle rectangle = new Rectangle(4,4);

        Assertions.assertEquals(16, rectangle.area());
    }
}
