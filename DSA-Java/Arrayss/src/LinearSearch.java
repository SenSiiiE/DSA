import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int flag=0;
        int[] arr= new int[10];
        System.out.println("Enter the no. of elements you want to insert: ");
        int value= sc.nextInt();
        System.out.print("Enter the elements: "+ " ");
        for(int i=0; i<value; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int ser= sc.nextInt();
        for(int i=0; i<value; i++){
            if(arr[i]==ser){
                flag= 1;
                System.out.println("Item found at index "+ i);
            }
        }
        if(flag!=1){
            System.out.println("Item is not present in the array");
        }
    }
}
