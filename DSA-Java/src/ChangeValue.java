import java.util.Arrays;
import java.util.Scanner;

public class ChangeValue {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter a(x): ");
//        int a= sc.nextInt();
//        System.out.println("enter b(y): ");
//        int b= sc.nextInt();
        int arr[]= {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int ary[]) {
        ary[1]=199;
//        System.out.println("x=" +x+" "+"y="+y);
    }
}
