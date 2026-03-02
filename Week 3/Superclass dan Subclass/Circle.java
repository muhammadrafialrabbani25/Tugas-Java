public class Circle extends Shape {

    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double r) {
        radius = r;
    }

    public Circle(double r, String c, boolean f) {
        super(c,f);
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public String toString() {
        return "Circle radius=" + radius + " dari " + super.toString();
    }

}