class palin {
    public static void main(String[] args) {
        long x = 1234567899;
        long ans = reverse(x);
        System.out.println(ans);
    }

    public static long reverse(long x) {
        long num = 0;
        long a = x;
        while (a > 0) {
            long rem = a % 10;
            num = num * 10 + rem;
            a = a / 10;
        }
        while (a < 0) {
            long rem = a % 10;
            num = num * 10 + rem;
            a = a / 10;
        }

        if (num > 2147483647 && num < -2147483648) {
            return 0;
        } else {
            return num;
        }

    }
}


