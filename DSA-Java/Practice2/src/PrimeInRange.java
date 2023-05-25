import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int x= sc.nextInt();
        prime();
    }

    private static void prime() {
        for(int i=2;i<100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
