import java.util.Scanner;

public class CircleAreaCircum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius= sc.nextFloat();
        AreaCircum(radius);

    }

    static void AreaCircum(float r) {
        float pi= 22/7f;
        float area= pi*r*r;
        float circumference= 2*pi*r;
        System.out.println("Area of the circle is "+area);
        System.out.println("circumference of the circle is "+circumference);

    }
}
