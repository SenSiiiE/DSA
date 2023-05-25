public class leet {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String [] words = s.split(" ");
        StringBuilder newString = new StringBuilder ("");
        for(int i = 0; i< words.length; i++){
            StringBuilder temp = new StringBuilder(words[i]);
            newString.append(temp.reverse());
            newString.append(" ");

        }
//        newString.reverse();
        return newString.toString();
    }
}
