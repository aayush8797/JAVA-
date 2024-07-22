import java.util.*;

public class binary_search{

    public static int binary(int number[], int key){

        int left=0;
        int right = number.length-1;

        while(left <= right){

            int mid = (left+right)/2;

            if(number[mid] == key){
                return mid;
            }
            else if(number[mid] < key){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a number you have to search : ");
            int key = sc.nextInt();

            int number[] = {1,6,14,27,48,59,70,86};
            int index = binary(number, key);

            if (index == -1){
                System.out.println("Key is not found.");
            }
            else{
                System.out.println("Key is found at the index "+index);
            }
        }
    }
}