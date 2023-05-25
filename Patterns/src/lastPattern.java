public class lastPattern {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
//        int [] distance = new int[4];
        int N = 2 * n - 2;
        for(int row = 1; row < N; row++ ){
            for(int col = 1; col < N; col++){
//                distance[0] = col;
//                distance[1] = row;
//                distance[2] = N - col;
//                distance[3] = N - row;
                int minimum = n - Math.min(Math.min(col, row), Math.min(N-col, N-row));
                System.out.print(minimum + " ");
            }
            System.out.println();
        }
    }
    public static int minimum(int [] distance){
        int min = distance[0];
        for(int i = 1; i< distance.length; i++){
            if(distance[i]<min){
                min = distance[i];
            }
        }
        return min;
    }
}
