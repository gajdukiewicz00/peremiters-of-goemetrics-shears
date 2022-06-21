package peremiters;

public class Square implements Squaree {public static double a, b;
    @Override
    public String getModel() {
        return "Square";

    }
    public Square() {}
    public Square(double a, double b) {

        if (a <= 0 | b <= 0) {
            throw new IllegalArgumentException("Rectangle side must be more 0");
        } else {

            this.a = a;
            this.b = b;
        }
    }

    @Override
    public double area() {
        return a * b;
    }


}
