import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements to be inserted: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i< arr.length; i++ ){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
//        System.out.println(Arrays.toString(arr));

    }
}
