import java.util.Scanner;

public class PalinDrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        palin(num);
    }

    static void palin(int num) {
        int pal = num;
        int newn = 0;
        while (pal > 0) {
            int rem = pal % 10;
            newn = newn * 10 + rem;
            pal = pal / 10;
        }
        if (newn == num) {
            System.out.println("The Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");

        }
    }

}


