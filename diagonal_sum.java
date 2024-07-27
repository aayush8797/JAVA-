public class diagonal_sum {

    public static void diagonal(int arr[][]){
        int n= arr.length;
        int sum =0;
        for(int i=0; i<n ; i++){
            //primary diagonal
            sum += arr[i][i];

            //secondary diagonal
            if(i != n-1-i){
                sum += arr[i][n-1-i];
            }
        }
        System.out.println("The sum of diagonal is : "+sum);
    }

    public static void main(String[] args) {
        int arr[][] =  {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        diagonal(arr);
    }
}
