public class TestShape {

    public static void main(String[] args) {

        Shape s1 = new Shape();
        System.out.println(s1.toString());

        Circle c1 = new Circle(2);
        System.out.println(c1.toString());
        System.out.println("Area = " + c1.getArea());

        Rectangle r1 = new Rectangle(2,3);
        System.out.println(r1.toString());
        System.out.println("Area = " + r1.getArea());

        Square sq1 = new Square(4);
        System.out.println(sq1.toString());
        System.out.println("Area = " + sq1.getArea());

    }

}