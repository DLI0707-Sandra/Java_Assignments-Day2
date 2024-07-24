package circle;

import java.util.Scanner;

public class Circle
{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    double area()
    {
        return (22*radius*radius)/7;
    }

    double perimeter()
    {
        return (2*22*radius)/7;
    }
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius=sc.nextDouble();
        Circle circle1=new Circle(radius);
        System.out.printf("Area = %.2f\n",circle1.area());
        System.out.printf("Perimeter =%.2f",circle1.perimeter());
    }
}
