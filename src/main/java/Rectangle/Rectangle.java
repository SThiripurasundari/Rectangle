package Rectangle;

public class Rectangle {

    private final float length;
    private final float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float area() {
        return length * width;
    }

    public float perimeter() {
        return 2 * (length + width);
    }
}
