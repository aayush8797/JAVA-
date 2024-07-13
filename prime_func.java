
import java.util.Scanner;

public class prime_func {

    public static void range(int n){
        for (int i = 2; i <=n; i++) {
            if (is_prime(i)) {
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static boolean is_prime(int n){
        if (n==2){
            return true;
        }
        for (int i = 2; i < n; i++) {
            if((n%i)==0){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n= sc.nextInt();
            range(n);
            
        }
    }
}
