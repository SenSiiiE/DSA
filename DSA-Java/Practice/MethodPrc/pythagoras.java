import java.util.Scanner;

public class pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean ans = isPythTriplat(a, b, c);
        System.out.println(ans);
    }

    static boolean isPythTriplat(int a, int b, int c) {
        int x = a * a;
        int y = b * b;
        int z = c * c;
        if (x + y == z || y + z == x || x + z == y) {
            return true;
        } else {
            return false;
        }
    }
}
