import java.util.Arrays;
import java.util.Scanner;

public class D2_Array {
    public static void main(String... args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num= sc.nextInt();
        int arr[][]= new int[3][3];
        for(int row=0; row< arr.length;row++){

            for (int col=0; col<arr[row].length; col++){
                arr[row][col]=sc.nextInt();
            }

        }
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
//        for(int row=0; row<arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
//        for(int row=0; row< arr.length;row++){
//
//            for (int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(arr);

    }
}
