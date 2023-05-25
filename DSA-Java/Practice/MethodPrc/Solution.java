import java.util.Scanner;

class Solution {
    public static float mySqrt(int a) {
        float i = 0;
        for (i = 1; i < a / 2; i++) {
            if (i * i == a) {
                return i;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float ans = mySqrt(a);
        System.out.println(ans);
    }
}