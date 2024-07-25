public class Insertion_sort {
    
    public static void insertionsort(int arr[]){

        for(int i=1; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;

            //finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    } 

    public static void printArr(int arr[]){

        for (int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        
        int arr[] = {16,5,9,3,18,1};
        insertionsort(arr);
        System.out.println("The sorted elements : ");
        printArr(arr);
    }
    
}
