import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
//        swape(arr, 2, 3);
        reverse(arr);
    }
    private static void reverse(int [] arr){
        int start= 0;
        int end= arr.length-1;

        while(start<end){
            swape(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void swape(int[] arr, int index1, int index2) {
        int temp= arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;
//        System.out.println(Arrays.toString(arr));

    }
}
