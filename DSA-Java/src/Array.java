import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int arr[]= new int[5];
        arr[0]=5;
        arr[1]=67;
        arr[2]=90;
        arr[3]=7;
        arr[4]=45;

        System.out.println(Arrays.toString(arr));
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for(int number: arr){
            System.out.print(number + " ");
        }
    }
}
