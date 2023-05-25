import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        System.out.println("Enter the no.: ");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
       int  count=0;
        while(a>0){
            int rem = a%10;
            if(rem==7){
                count++;
            }
            a=a/10;
        }
        System.out.println(count);
    }
}
