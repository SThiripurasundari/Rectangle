import Rectangle.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {

    @Test
    void checkForArea20ForLength4andWidth5() {

        Rectangle rectangle = new Rectangle(4, 5);

        float area = rectangle.area();

        assertEquals(20, area);

    }

    @Test
    void checkForArea16ForLength4AndWidth4() {

        Rectangle rectangle = new Rectangle(4, 4);

        float area = rectangle.area();

        assertEquals(16, area);
    }

    @Test
    void checkForAreaWithFloatForLengthAndWidth() {

        Rectangle rectangle = new Rectangle(4.5f, 4.5f);

        float area = rectangle.area();

        assertEquals(20.25f, area);
    }

    @Test
    void checkForPerimeter18ForLength4AndWidth5() {

        Rectangle rectangle = new Rectangle(4, 5);

        float perimeter = rectangle.perimeter();

        assertEquals(18, perimeter);


    }

    @Test
    void checkForPerimeterFloat12point0ForLength2point0Andwidth4point0() {

        Rectangle rectangle = new Rectangle(2.0f, 4.0f);

        float perimeter = rectangle.perimeter();

        assertEquals(12.0, perimeter);

    }

    @Test
    void checkForPerimeter28ForLength8AndWidth6() {

        Rectangle rectangle = new Rectangle(8, 6);

        float perimeter = rectangle.perimeter();

        assertEquals(28, perimeter);

    }
}
