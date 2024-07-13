import java.util.Scanner;

public class palindrome {
    public static void palin(int n){
        int m=n;
        int reverse =0;
        while (n>0){
            int num = n%10;
            reverse = (reverse*10) +num;
            n /= 10;
        }
        if(m==reverse){
            System.out.println("It is palindrome number.");
        }
        else{
            System.out.println("It is not palindrome number.");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            palin(n);
        }
    }
}
