import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int temp = 0;
        int cursor = 2;
        while (cursor <= n) {
            temp = b;
            b = b + a;
            a =  temp;
            cursor++;
            System.out.print(b +" ");
        }
    }
}
