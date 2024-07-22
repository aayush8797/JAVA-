import java.util.*;

public class linear_search{

    public static int search(int marks[], int key){

        for(int i=0; i<marks.length; i++){

            if(marks[i]==key){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            int marks[] = {76,67,98,43,62,54,79,23};
            System.out.println("Enter a number that you have to search : ");
            int key = sc.nextInt();

            int index = search(marks, key);

            if(index == -1){
                System.out.println("Key is not found.");
            }
            else{
                System.out.println("Key is found at the index "+index+".");
            }
        }
    }
}