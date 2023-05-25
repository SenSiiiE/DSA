class abc {
    public static void main(String[] args){
        int[] nums= {437,315,322,431,686,264,442};
        int a= findNumbers(nums);
        System.out.println(a);
    }
    public static int findNumbers(int[] nums) {
        int ans=0;
//        int count=0;

        for(int i=0; i<nums.length;  i++){
            int flag= nums[i];
            int count=0;
            while(flag>0){
                flag=flag/10;
                count++;
            }
            if(count%2==0){
                ans++;
            }
        }
        return ans;

    }
}