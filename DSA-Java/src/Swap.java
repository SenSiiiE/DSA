public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        int temp = a;                    |
//        a = b;                           | this will swap the numbers but the
//        b = temp;                        | static method won't swap the no. because it creates a copy of object not modify it
//        System.out.println(a+" "+b);

        swap(a ,b);
        System.out.println(a+" "+b);
    }

    static void swap(int a, int b) {
        int temp= a;
        a=b;
        b= temp;

    }
}
