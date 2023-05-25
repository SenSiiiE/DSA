import java.util.Scanner;

public class GradeFromMarks {
    static void Grade(int marks){
        switch (marks){
            case 91,92,93,94,95,96,97,98,99,100-> System.out.println("The grade is AA");
            case 81,82,83,84,85,86,87,88,89,90-> System.out.println("the grade is AB");
            default -> System.out.println("Pass");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();
        Grade(marks);
    }

    }

