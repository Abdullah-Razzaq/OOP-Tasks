package OopLectures;
import java.util.Scanner;
public class circleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle c1=new Circle(4.5);
        System.out.println("enter radius");
        c1.setRadius(input.nextDouble());
        System.out.println(c1.calArea(c1.getRadius()));
        System.out.println(c1.calPerimeter(c1.getRadius()));

    }
}
