import java.util.Scanner;

public class Armstrong {

        static boolean isArmstrong(int n){
            int original= n;
            int sum= 0;

            while(n>0){
                int rem= n%10;
                sum=sum+rem*rem*rem;
                n=n/10;
            }
            if (sum==original){
                return true;
            }else{
                return false;
            }

        }
    public static void main(String[] args) {
//        Scanner sc=new Scanner (System.in);
//        int n= sc.nextInt();
//        boolean ans=isArmstrong(n);
//        System.out.println(ans);

        for(int i=100; i<1000; i++){
            if(isArmstrong(i))
            System.out.println(i + " ");
        }
    }
    }
