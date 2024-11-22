
package Problem3;

public class Demo {
    public static void main(String[] args) {
        // Create an array of shapes containing various shape types
        Shape[] shapes = {
            new Circle("Circle1", 5),                // Circle with radius 5
            new Ellipse("Ellipse1", 7, 5),           // Ellipse with major axis 7 and minor axis 5
            new Triangle("Triangle1", 3, 4, 5),      // Triangle with sides 3, 4, and 5
            new EquilateralTriangle("Equilateral Triangle", 6) // Equilateral triangle with side 6
        };

        // Iterate through the shapes and print their details
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
