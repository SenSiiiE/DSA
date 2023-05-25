import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radiuse of Circle: ");
        int radius = sc.nextInt();
        CircumArea(radius);
    }

    static void CircumArea(int radius) {
        float pi = 22 / 7f;
        float area = pi * radius * radius;
        float Circumference = 2 * pi * radius;
        System.out.println(pi);
        System.out.println("Area of circle is " + area);
        System.out.println("Circumference of circle is " + Circumference);
    }
}
