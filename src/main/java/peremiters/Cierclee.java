package peremiters;

public class Cierclee implements Ciercle {
    public  double radius;
    @Override
    public String getModel() {
        return "Circle";
    }
    public Cierclee(){}
    public Cierclee(double radius ) {

        if (radius <= 0 ) {
            throw new IllegalArgumentException("Circle radius must be more 0");
        } else {
            this.radius = radius;
        }
    }
    @Override
    public double area() {
        return (Math.PI * radius * radius);
    }

}
