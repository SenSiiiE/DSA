public class Maxx {
    public static void main(String[] args) {
        int[] arr= {1000,20,99,12,23};
        System.out.println(maxx(arr));
    }

    private static int maxx(int[] arr) {
        int m= 0;
//        if(arr[2]>m) {
//            m = arr[2];
//        }
//
//        if(arr[3]>m) {
//            m = arr[3];
//        }
//
//        if(arr[4]>m) {
//            m = arr[4];
//        }
//        if(arr[0]>m){
//            m= arr[0];
//        }

        for(int i=2; i<5; i++){
            if(arr[i]>m){
                m = arr[i];
            }

        }
           return m;
    }
}
