import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        String ans= oddeven(num);
        System.out.println("The number is: "+ans);
    }
    private static String oddeven(int n) {
//        String even= "even";
        if(n%2==0){
            return "even";
        } else {
            return "Odd";
        }
    }
}
