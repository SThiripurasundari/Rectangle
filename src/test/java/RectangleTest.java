import Rectangle.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {

    @Test
    void checkForArea20ForLength4andWidth5() {

        Rectangle rectangle = Rectangle.rectangle(4, 5);

        float area = rectangle.area();

        assertEquals(20, area);

    }

    @Test
    void checkForArea16ForLength4AndWidth4() {

        Rectangle rectangle = Rectangle.rectangle(4, 4);

        float area = rectangle.area();

        assertEquals(16, area);
    }

    @Test
    void checkForAreaWithFloatForLengthAndWidth() {

        Rectangle rectangle = Rectangle.rectangle(4.5f, 4.5f);

        float area = rectangle.area();

        assertEquals(20.25f, area);
    }

    @Test
    void checkForPerimeter18ForLength4AndWidth5() {

        Rectangle rectangle = Rectangle.rectangle(4, 5);

        float perimeter = rectangle.perimeter();

        assertEquals(18, perimeter);


    }

    @Test
    void checkForPerimeterFloat12point0ForLength2point0Andwidth4point0() {

        Rectangle rectangle = Rectangle.rectangle(2.0f, 4.0f);

        float perimeter = rectangle.perimeter();

        assertEquals(12.0, perimeter);

    }

    @Test
    void checkForPerimeter28ForLength8AndWidth6() {

        Rectangle rectangle = Rectangle.rectangle(8, 6);

        float perimeter = rectangle.perimeter();

        assertEquals(28, perimeter);

    }

    @Test
    void checkForArea16ForSide4() {

        Rectangle square = Rectangle.square(4);

        float area = square.area();

        assertEquals(16, area);

    }

    @Test
    void checkForArea81ForSide9() {

        Rectangle square = Rectangle.square(9);

        float area = square.area();

        assertEquals(81, area);

    }


    @Test
    void checkForArea25point0ForSide5point0() {

        Rectangle square = Rectangle.square(5.0f);

        float area = square.area();

        assertEquals(25, area);

    }

    @Test
    void checkForArea33point0625For5point75() {
        Rectangle square = Rectangle.square(5.75f);

        float area = square.area();

        assertEquals(33.0625, area);
    }


    @Test
    void CheckForPerimeter28ForSide4() {

        Rectangle square = Rectangle.square(7);

        float perimeter = square.perimeter();

        assertEquals(28, perimeter);

    }

    @Test
    void CheckForPerimeter100ForSide10() {

        Rectangle square = Rectangle.square(10);

        float perimeter = square.perimeter();

        assertEquals(40, perimeter);

    }

    @Test
    void CheckForPerimeter32point0ForSide8point0() {

        Rectangle square = Rectangle.square(8.0f);

        float perimeter = square.perimeter();

        assertEquals(32.0, perimeter);

    }


}
