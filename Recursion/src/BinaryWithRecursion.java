public class BinaryWithRecursion {
    public static void main(String[] args) {
     int arr[] = {1,2,3,4,5,77,99};
     int start = 0;
     int end = arr.length-1;
     int target = 99;
        System.out.println(search(arr, target, start, end));


    }
    public static int search(int [] arr, int target, int start, int end){
        int mid = start + (end - start)/2;

        if(start<=end){
            if(arr[mid] == target ){
                return mid;
            } else if (arr[mid] > target) {
                return search(arr, target, start, mid - 1);

            }else{
                return search(arr, target, mid + 1, end);
            }
        }
        return -1;
    }
}

