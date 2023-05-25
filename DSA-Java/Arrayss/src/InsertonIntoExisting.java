import java.util.Arrays;
import java.util.Scanner;

public class InsertonIntoExisting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 10;
        int [] arr= new int[n];
        arr = new int[]{21, 123, 45, 6, 44};
        System.out.print("Enter the index on which you want to insert: ");
        int pos = sc.nextInt();
        System.out.println("Enter the value you want to insert: ");
        int val = sc.nextInt();
        System.out.println(Arrays.toString(arr));

        System.out.println("Array after insertion: "+ Arrays.toString(arr));
    }
}
