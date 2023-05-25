public class basic {
    public static void main(String[] args) {
        int n = 5;
        pattern2(n);
    }
    public static void patter3(int n){

    }
    public static void pattern2(int n){
        for(int i = 0; i<=n; i++){
            for(int j = n-i; j>=0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern1(int n){
        for(int i = 0; i< n; i++){
            for(int j = 0; j<=i; j++) {
                System.out.print("  ");
            }
            for(int k = i; k<n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
