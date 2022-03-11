import Square.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    void checkForArea16ForSide4() {

        Square square = new Square(4);

        float area = square.area();

        Assertions.assertEquals(16, area);

    }


}
