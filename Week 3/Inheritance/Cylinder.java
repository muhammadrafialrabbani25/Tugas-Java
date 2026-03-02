public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double h) {
        super();
        height = h;
    }

    public Cylinder(double r, double h) {
        super(r);
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        double r = getRadius();
        double luas = 2 * 3.14 * r * height + 2 * super.getArea();
        return luas;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public String toString() {
        return "Cylinder dari " + super.toString() + " tinggi=" + height;
    }

}