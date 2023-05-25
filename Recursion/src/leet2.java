import java.util.Arrays;

public class leet2 {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int []count = new int [nums1.length];
        int k = 0;
        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    count[k] = nums1[i];
                    k++;
                    break;
                }
            }
        }
        return count;
    }
}
