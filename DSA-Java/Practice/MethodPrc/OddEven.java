import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println(("The number is Odd"));
        }
    }
}