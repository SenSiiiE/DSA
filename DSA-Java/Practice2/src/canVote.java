import java.util.Scanner;

public class canVote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= sc.nextInt();
        boolean ans=Vote(age);
        System.out.println(ans);
    }
    static boolean Vote(int age){
        if(age>18){
            return true;
        } else {
            return false;
        }

    }
}
