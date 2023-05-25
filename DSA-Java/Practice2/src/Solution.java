public class Solution {
    public static void main(String [] args){
        int x= 1534236469;
        int ans=reverse(x);
        System.out.println(ans);
    }
    public static int reverse (int x) {
        int num=0;
        int a = x;
        while(a>0){
            int rem= a%10;
            num=num*10+rem;
            a=a/10;
        }
        while (a < 0) {
            int rem= a%10;
            num=num*10+rem;
            a=a/10;
        }
        if ( num>2147483647){
            return 0;
        }else{
            return num;
        }

    }
}



