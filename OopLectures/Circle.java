package OopLectures;
public class Circle {
    private double radius;

    public Circle(double radius)
    {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius>0)
        this.radius = radius;
    }
    public double calArea(double radius){
        return 3.14*(radius*radius);
    }
    public double calPerimeter(double radius){
        return 2*3.14*radius;
    }
}
