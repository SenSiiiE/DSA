import java.util.Scanner;



//import static jdk.dynalink.linker.support.Guards.isIdentical;

public class IdenticalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[2][2];
        int arr2[][] = new int[2][2];
        int count = 0;
        Insert(arr1, arr2, sc, count);
        System.out.println(count);
        isIdentical(arr1, arr2, count);
    }

    static void Insert(int[][] arr1, int[][] arr2, Scanner sc, int count) {
        System.out.println("Enetr the elements of the first array: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
                count = count +1;
            }
        }
        System.out.println("Enetr the elements of the second array: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
    }

    static void isIdentical(int[][] arr1, int[][] arr2, int count) {

        int ident = 0;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    if (arr1[i][j] == arr2[i][j]) {
                        ident++;
                    }
                }
            }
        }
        if(ident==count){
            System.out.println("Matrices are identical");
        }else{
            System.out.println("Matrices are not identical");
        }
    }
}