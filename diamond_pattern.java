import java.util.*;

public class diamond_pattern{
    public static void diamond(int n){

        //1st half
        for(int i =1; i<=n; i++){

            // spaces - (n-i)
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }

            //star - ((2*i)-1)
            for (int j=1; j<=((2*i)-1); j++){
                System.out.print("* ");
            }
            //next line
            System.out.println("");
        }

        for(int i =n; i>=1; i--){

            // spaces - (n-i)
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }

            //star - ((2*i)-1)
            for (int j=1; j<=((2*i)-1); j++){
                System.out.print("* ");
            }
            //next line
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            diamond(n);
        }
    }
}