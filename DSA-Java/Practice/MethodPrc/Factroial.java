import java.util.Scanner;

public class Factroial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fact(num);
    }

    static void fact(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

//        while (num > 0) {
//            int i = 1;
//            factorial = num * i;
//            i++;


        }
        System.out.println(factorial);
    }
}
