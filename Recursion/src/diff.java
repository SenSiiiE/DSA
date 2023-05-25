import java.util.Arrays;

public class diff {
    public static void main(String[] args) {
//        int [] nums = {1,2,3,4,5,6,7};
        String s = "b";
        String t = "abc";

        System.out.println(isSubsequence(s, t));
    }
    public static boolean isSubsequence(String s, String t) {
        int count = 0;
        int slength = s.length();
        if(slength==0){
            return true;
        }
        for(int i = 0; i<t.length(); i++){
            if(s.charAt(count) == t.charAt(i)) count++;
        }


        return false;
    }
}
