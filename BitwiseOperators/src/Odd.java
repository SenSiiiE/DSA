
public class Odd {
    public static void main(String[] args) {
        int n = 98;
        System.out.println(isOdd(n));
        }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
