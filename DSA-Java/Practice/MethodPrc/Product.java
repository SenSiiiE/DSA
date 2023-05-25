import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First no.: ");
        int a = sc.nextInt();
        System.out.print("Second no: ");
        int b = sc.nextInt();
        int ans = multiply(a, b);
        System.out.println("The product is: " + ans);

    }

    static int multiply(int a, int b) {
        int prod = a * b;
        return prod;
    }
}
