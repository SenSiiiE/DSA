import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Enter the no.");
        Scanner sc= new Scanner(System.in);

        int num= sc.nextInt();
        int count=0;

        while(num>0){
            int rem= num%10;
//            if(rem==7){
////                count++;
//            }
            num=num/10;
            count=10*count+rem;
//            System.out.println((num));
        }
        System.out.println(count);
    }

}
