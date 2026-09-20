package shapeclass;
import java.util.Scanner;


class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        Circle c = new Circle(radius);
        Rectangle r = new Rectangle(length, width);

        System.out.println("Area of Circle = " + c.area());
        System.out.println("Area of Rectangle = " + r.area());
        
        sc.close();
    }
}