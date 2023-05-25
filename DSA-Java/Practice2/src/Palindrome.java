import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        palin(n);
    }

    static void palin(int n) {
        int number= 0;
        int temp= n;
        while(temp>0) {
            int rem = temp % 10;
            number = number * 10 + rem;
            temp = temp / 10;
        }
            if(number==n){
                System.out.println("The number is palindrome");

            } else{
                System.out.println("The number is not palindrome");

            }

    }
}
