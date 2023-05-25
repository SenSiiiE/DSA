public class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=5; i<=n; i--) {
            System.out.println("* ");
            for(int j=2; j<=i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
//        int rows = 5;
//
//        for (int i = 1; i <= rows; i++) {  //Outer loop for rows
//
//            for (int j = 1; j <= i; j++) { //Inner loop for Col
//
//                System.out.print("* "); //Print *
//
//            }
//
//            System.out.println(); //New line
//
//        }
//
//    }
//
//}