import java.util.Scanner;

public class GradeFromMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        Grades(marks);
    }

    static void Grades(int marks) {
        switch (marks) {
            case 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 -> System.out.println("The grade is AA");
            case 81, 82, 83, 84, 85, 86, 87, 88, 89, 90 -> System.out.println("The grade is AB");
            case 71, 72, 73, 74, 75, 76, 77, 78, 79, 80 -> System.out.println("The grade is BB");
            case 61, 62, 63, 64, 65, 66, 67, 68, 69, 70 -> System.out.println("The grade is BC");
            case 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 -> System.out.println("The grade is CD");
            case 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 -> System.out.println("The grade is DD");
            default -> System.out.println("Fail");
        }

    }
}
