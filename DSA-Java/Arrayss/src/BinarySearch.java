import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8,9,10};
        int start=0;
        int flag=0;
        int end= arr.length-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        int ser = sc.nextInt();
        int mid= (0+end)/2;

        while(start<end){
//            if(ser>arr[end] || ser<arr[start]){
//                System.out.println("Item not found");
//                break;
//            }
            if(ser==arr[mid]){
                flag = 1;
                System.out.println("Item found at index "+mid);
                break;
            }
        if(ser>arr[mid]) {
            start = mid+1;
            mid = (start+end)/2;
        }
        if(ser<arr[mid]){
            end = mid - 1;

            mid = (start+end)/2;
        }



        }
        if(flag ==0){
            System.out.println("Item not found");
        }
    }
}
