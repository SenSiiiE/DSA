import java.util.Scanner;

public class primeInRange {
    static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper = sc.nextInt();

        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        sc.close();
    }
}



