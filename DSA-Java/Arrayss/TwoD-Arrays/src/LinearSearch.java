import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 54, 12},
                {99, 124, 2, 34},
                {43, 22}
        };
//        int flag = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the element to search: ");
//        int target = sc.nextInt();
        int ans = search1(arr);
//        if (ans[0]==-1 && ans[1]==-1){
//            System.out.println("Item not found");
//        }else {
//            System.out.println(Arrays.toString(ans));
//        }
        System.out.println(ans);
    }

    public static int search1(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (target == arr[i][j]) {
//                    flag = 1;
//                    return new int[]{i, j};
//                    int row= i+1;
//                    int col= j+1;
//                    System.out.println("Item is present at Row "+row+" and column "+col);
            }


        }
//        if(flag==0){
//            System.out.println("Item not found");
        return max;
    }
}



