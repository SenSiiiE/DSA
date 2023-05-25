import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first no.: ");
        int x= sc.nextInt();
        System.out.println("Enter the second no.: ");
        int y= sc.nextInt();
        System.out.println("Enter the third no.: ");
        int z= sc.nextInt();

        int Maximum= isMax(x,y,z);
        int Minimum= isMin(x,y,z);
        System.out.println("Max is: "+Maximum);
        System.out.println("Min is: "+Minimum);
    }

    private static int isMax(int x, int y, int z) {
        int max= x;
        if(y>x){
            max=y;
        }
        if(z>y){
            max=z;
        }
        return max;
    }

    private static int isMin(int x, int y, int z) {
        int min= x;
        if(y<x){
            min=y;
        }
        if(z<y){
            min=z;
        }
        return min;
    }
}
