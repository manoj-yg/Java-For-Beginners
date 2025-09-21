import java.util.*;
public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // formal of area of circle is c=pi *r^2
        double pi=3.14;
        System.out.print("Enter the radius of the Circle: ");
        double radius=sc.nextDouble();
        double AreaOfCircle=pi*radius*radius;
        System.out.println("Area of the Circle is: "+AreaOfCircle+" MeterSquare");

    }
}
