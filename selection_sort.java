public class selection_sort {
    
    public static void selectionsort(int arr[]){

        for (int i =0; i < arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                //swap
                if(arr[minPos] > arr[j]){

                    minPos=j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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
        selectionsort(arr);
        System.out.println("The sorted element : ");
        printArr(arr);
    }
}
