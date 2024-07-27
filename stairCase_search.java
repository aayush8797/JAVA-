import java.util.*;
public class search_in_sorted_matrix{

    public static boolean staircaseSearch(int arr[][],int key){

        int row =0 ;
        int col = arr[0].length-1;
        
        while(row < arr.length && col >= 0){
            if(arr[row][col] == key){
                System.out.println("Found key at {"+row+","+col+"}");
                return true;
            }
            else if (key < arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number to search : ");
            int key = sc.nextInt();
            int arr[][] =  {{10,20,30,40},
                            {15,25,35,45},
                            {18,29,37,48},
                            {22,33,39,50}};
            staircaseSearch(arr, key);
        }
    }
}