import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int a = sc.nextInt();
        boolean ans = isPrime(a);
        System.out.println(ans);
    }

    static boolean isPrime(int a) {
        int c = 2;
        while (c < a) {
            int num = a % c;
            c++;
            if (num == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
