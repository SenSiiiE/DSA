public class factorial {
    public static void main(String[] args) {
        int fact = 1;
        int ans = fact_fun(5, fact);
        System.out.println(ans);
    }
    public static int fact_fun(int n, int fact){

        if(n>0){
            fact = fact* n;
            return fact_fun(n-1, fact);
        }else{
            return fact;
        }

    }
}
