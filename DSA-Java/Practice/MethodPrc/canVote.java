import java.util.Scanner;

public class canVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();


        Vote(age);
    }

    static void Vote(int age) {
        if (age >= 18) {
            System.out.println("Person can vote");
        } else {
            System.out.println("Not eligible to Vote");
        }
    }
}
