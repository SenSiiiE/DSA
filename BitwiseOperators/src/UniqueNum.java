public class UniqueNum {
    public static void main(String[] args) {
        int [] arr = {2,3,6,3,3,2,2};
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {
        int unique = 0;
        for(int i : arr){
            unique = unique ^ i;
        }
        return unique;
    }
}
