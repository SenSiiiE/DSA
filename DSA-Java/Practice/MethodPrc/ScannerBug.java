import java.util.Scanner;

public class ScannerBug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first integer: ");
        int a = sc.nextInt();
        System.out.println("enter the first string: ");
        String x = sc.nextLine();
        System.out.print("enter the second integer: ");
        int b = sc.nextInt();

        System.out.println("1st integer: " + a);
        System.out.println("1st string: " + x);
        System.out.println("2nd integre: " + b);


    }
}
