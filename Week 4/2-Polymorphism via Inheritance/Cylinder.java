public class Cylinder extends Shape
{
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double r, double h)
    {
        super("Cylinder");
        radius = r;
        height = h;
    }

    // Area (sesuai modul)
    public double area()
    {
        return Math.PI * radius * radius * height;
    }

    // toString
    public String toString()
    {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}