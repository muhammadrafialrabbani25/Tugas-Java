public class Square extends Rectangle {

    public Square() {
        super(1.0,1.0);
    }

    public Square(double s) {
        super(s,s);
    }

    public void setSide(double s) {
        setWidth(s);
        setLength(s);
    }

    public String toString() {
        return "Square dari " + super.toString();
    }

}