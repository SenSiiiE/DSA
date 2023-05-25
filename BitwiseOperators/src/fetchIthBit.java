public class fetchIthBit {
    public static void main(String[] args) {
        int n =  239;
        System.out.println(iTh(n));
    }

    private static int iTh(int n) {
        return n & 1<<(n-1);
    }
}
