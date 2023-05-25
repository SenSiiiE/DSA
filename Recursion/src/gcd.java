public class gcd {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(hasGCD(a, b));
    }

    private static int hasGCD(int a, int b) {
        if(a == b){
            return a;
        } else if (a<b) {
            return hasGCD(b, a);
        }
        else {
            return hasGCD(b, a-b);
        }

    }
}
