import java.util.Scanner;

public class reverse0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        int ans = reverse1(x);
        System.out.println(ans);
    }

    private static int reverse1(int x) {
        int a = x;
        int num = 0;
        while (a > 0) {
            int rem = a % 10;
            num = num * 10 + rem;
            a = a / 10;
        }
        return num;
    }
}
