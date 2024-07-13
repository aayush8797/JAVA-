import java.util.*;
public class binomial {
    public static int fact(int num){
        int fact = 1;
        for(int i =1 ; i<=num ; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int binomial_C (int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r);
        int bin = (n_fact) / (r_fact * nmr_fact) ;
        return bin;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter n:"); 
            int n =sc.nextInt();
            System.out.println("Enter r:"); 
            int r =sc.nextInt();
            System.out.println("Your Result is : "+ binomial_C(n, r));
        }
    }
}
