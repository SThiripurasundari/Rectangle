package Rectangle;

public class Rectangle {

    private final float length;
    private final float width;

    private Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public static Rectangle square(float side) {
        return new Rectangle(side, side);
    }

    public static Rectangle rectangle(float length, float width) {
        return new Rectangle(length, width);
    }

    public float area() {
        return length * width;
    }

    public float perimeter() {
        return 2 * (length + width);
    }
}
