
package Problem2;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() { return xSpeed; }
    public void setXSpeed(float xSpeed) { this.xSpeed = xSpeed; }

    public float getYSpeed() { return ySpeed; }
    public void setYSpeed(float ySpeed) { this.ySpeed = ySpeed; }

    public void move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    @Override
    public String toString() {
        return super.toString() + " speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}
