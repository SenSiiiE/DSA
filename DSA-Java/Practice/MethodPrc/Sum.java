import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Frist no. : ");
        int a = sc.nextInt();
        System.out.print("Second no. : ");
        int b = sc.nextInt();
        sum(a, b);
    }

    static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is " + sum);
    }
}
