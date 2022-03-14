package Rectangle;

import org.w3c.dom.css.Rect;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Rectangle {

    private final float length;
    private final float width;

    private Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    /*public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(4,9);;
        System.out.print(r1.equals(r2));

        Set<Rectangle> employees = new HashSet<Rectangle>();
        employees.add(r1);
        employees.add(r2);

        System.out.println(employees.size());

    }*/

    @Override
    public boolean equals(Object o) {
        System.out.println("In Equals ");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(rectangle.length, length) == 0 && Float.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        System.out.println("In hasgcode  ");

        return Objects.hash(length, width);
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
