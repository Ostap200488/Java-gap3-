package Problem4;

/**
 * Ellipse class represents an ellipse and implements the Scalable interface.
 */
public class Ellipse extends Shape implements Scalable {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);
    }

    @Override
    public void scale(double factor) {
        majorAxis *= factor;
        minorAxis *= factor;
    }

    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (majorAxis + minorAxis) - Math.sqrt((3 * majorAxis + minorAxis) * (majorAxis + 3 * minorAxis)));
    }

    @Override
    public String toString() {
        return super.toString() + ", Major Axis: " + majorAxis + ", Minor Axis: " + minorAxis +
               ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
