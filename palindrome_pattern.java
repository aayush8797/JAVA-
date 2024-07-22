import java.util.*;

public class palindrome_pattern{

    public static void palindrome(int n){

        for(int i=1; i<=n; i++){

            //this loop is for the spaces
            for(int j =i; j<=n; j++){
                System.out.print("  ");
            }
            
            //this loop is for print number i to 1
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }

            //this loop is for the number in reverse order
            for (int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            //next line
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter a number : ");
            int n = sc.nextInt();

            //call the function
            palindrome(n);
        }
    }
}