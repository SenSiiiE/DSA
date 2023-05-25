public class min {
    public static void main(String[] args) {
        int[] arr={21, 45, 10, 67, 68};
        int Mil=arr[0];
        int ans=Minimum( arr, Mil);
        System.out.println(ans);
    }

    private static int Minimum(int[] arr, int Mil) {
        for (int i=1; i<arr.length; i++){
            if(arr[i]<Mil){
                Mil=arr[i];
            }
        }
        return Mil;
    }
}
