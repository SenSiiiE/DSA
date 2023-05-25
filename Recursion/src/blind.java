public class blind {
    public static void main(String[] args) {
        int [] arr = {1,3,1,1,2,4};
        System.out.println(canJump(arr));
    }
    public static boolean canJump(int [] arr){
        int flag = 0;
        int len = arr.length - 1;

        while(flag<=len){
            flag =  flag + arr[flag];

            if(flag>len){
                return false;
            }
            if(flag == len){
                return true;
            }
            if(arr[flag] == 0 && flag < len){
                return false;
            }
        }
        return false;
    }
}
