
package Problem2;

public class Demo {
    public static void main(String[] args) {
        // Create a MovablePoint object with initial position (0, 0) and speed (2, 3)
        MovablePoint point = new MovablePoint(0, 0, 2, 3);

        // Display the point's state before moving
        System.out.println("Before moving: " + point);

        // Move the point
        point.move();

        // Display the point's state after moving
        System.out.println("After moving: " + point);
    }
}
