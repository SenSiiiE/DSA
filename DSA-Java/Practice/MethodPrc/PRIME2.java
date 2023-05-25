import java.util.Scanner;

public class PRIME2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the lb: ");
//        int lb = sc.nextInt();
//        System.out.println("enter the ub: ");
//        int ub = sc.nextInt();
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean ans = noIsPrime(num);
        System.out.println(ans);
//        for (int i = lb; i < ub; i++) {
//            if (noIsPrime(i)) {
//                System.out.println(i);
//            }
//        }
    }

    private static boolean noIsPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int c = 2;
        int flag = 0;
        while (c * c < num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
//        for ( int i=2; i<=num/2; i++){
//            if(num%i==0){
//                flag++;
//                return false;
//            }
//        }
        return true;
    }

}

