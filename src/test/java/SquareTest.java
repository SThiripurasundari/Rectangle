import Square.Square;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void checkForArea16ForSide4() {

        Square square = new Square(4);

        float area = square.area();

        assertEquals(16, area);

    }
    @Test
    void checkForArea81ForSide9() {

        Square square = new Square(9);

        float area = square.area();

        assertEquals(81, area);

    }


    @Test
    void checkForArea25point0ForSide5point0() {

        Square square = new Square(5.0f);

        float area = square.area();

        assertEquals(25, area);

    }

    @Test
    void CheckForPerimeter28ForSide4() {

        Square square = new Square(7);

        float perimeter = square.perimeter();

        assertEquals(28, perimeter);

    }

    @Test
    void CheckForPerimeter100ForSide10() {

        Square square = new Square(10);

        float perimeter = square.perimeter();

        assertEquals(40, perimeter);

    }

    @Test
    void CheckForPerimeter32point0ForSide8point0() {

        Square square = new Square(8.0f);

        float perimeter = square.perimeter();

        assertEquals(32.0, perimeter);

    }


}
