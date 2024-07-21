import java.util.*;

public class pyramid_pattern{

    public static void pyramid(int n){

        int rowcount = 1;

        for(int i = n; i>0; i--){

            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=rowcount;j++){
                System.out.print(rowcount+" ");
            }
            System.out.println("");

            rowcount++;
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            pyramid(n);
        }
    }
}