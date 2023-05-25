import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class deletion {
    public static void main(String[] args) {
        int [] arr = {12,5,31,24,45,99};
        int [] arr2 = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to delete:");
        int d = sc.nextInt();
        for (int i=0; i< arr.length; i++){
            if(arr[i]==d){
                arr[i]=0;
                for(int k=0; k< arr2.length; k++){
                    if(arr[i]!=0){
                        arr2[k]= arr[i];

                }


                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
