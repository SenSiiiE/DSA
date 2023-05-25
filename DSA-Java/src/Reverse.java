import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the no.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int newn =0;
        while(a>0){
            int rem=a%10;
            newn=10*newn+rem;
            a=a/10;
        }
        System.out.println(newn);
    }
}
