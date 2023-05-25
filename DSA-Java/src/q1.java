import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no.: ");
        int n = sc.nextInt();
        System.out.print("Enter second no.: ");
        int m = sc.nextInt();
        System.out.print("Enter third no.: ");
        int x = sc.nextInt();

        isMax(n,m,x);
        isMin(n,m,x);

    }

    static void isMin(int n, int m, int x) {
        int min = n;
        if(m<min){
            min=m;
        }
        if(x<min){
            min=x;
        }
        System.out.println("Minimum : "+min);
    }

    static void isMax(int n, int m, int x){
            int max= n;
            if(m>max ){
                max = m;
            }
            if( x > max){
                max = x;
            }

            System.out.println("Maximum : "+max);

    }
}
