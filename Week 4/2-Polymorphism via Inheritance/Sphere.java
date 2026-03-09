public class Sphere extends Shape
{
    private double radius;

    // Constructor
    public Sphere(double r)
    {
        super("Sphere");
        radius = r;
    }

    // Surface area of sphere
    public double area()
    {
        return 4 * Math.PI * radius * radius;
    }

    // toString
    public String toString()
    {
        return super.toString() + " of radius " + radius;
    }
}