package Problem4;

public class Demo {
    public static void scaleShapes(Scalable[] scalables, double factor) {
        System.out.println("Before scaling:");
        for (Scalable scalable : scalables) {
            System.out.println(scalable);
        }

        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }

        System.out.println("\nAfter scaling:");
        for (Scalable scalable : scalables) {
            System.out.println(scalable);
        }
    }

    public static void main(String[] args) {
        Scalable[] shapes = {
            new Circle("Circle1", 5),
            new Ellipse("Ellipse1", 7, 5),
            new Triangle("Triangle1", 3, 4, 5),
            new EquilateralTriangle("Equilateral Triangle", 6)
        };

        scaleShapes(shapes, 2);
    }
}
