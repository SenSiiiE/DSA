import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

//        switch (name) {
//            case "Vikash":
//                System.out.println("My name is Vikash");
//                break;
//            case "Sapna":
//                System.out.println("My name is Sapna");
//                break;
//            default:
//                System.out.println("Enter valid name");
//        }

        switch (name) {
            case "Vikash" -> System.out.println("My name is Vikash");
            case "Sapna" -> System.out.println("My name is Sapna");
            default -> System.out.println("Enter valid name");
        }

    }
}
