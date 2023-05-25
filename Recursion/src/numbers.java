public class numbers {
    public static void main(String[] args) {
//        print1(1);
        reverse(5);
    }

    private static void print1(int n) {
        if(n <= 5){
            System.out.println(n);
            print1(n+1);
        }
    }
    static void reverse(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        reverse(n-1);
        System.out.println(n);
    }
}
