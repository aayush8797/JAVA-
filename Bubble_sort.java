public class Bubble_sort{

    public static void bubblesort(int arr[]){

        for (int turn =0; turn < arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn ; j++){
                //swap
                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        bubblesort(arr);
        System.out.println("The sorted element : ");
        printArr(arr);
    }
} 