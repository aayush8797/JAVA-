import java.util.Scanner;

public class sum_of_digit {
    public static int digit(int n){
        int sum =0;
        while (n>0){
            int num = n%10;
            sum = sum +num;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            System.out.println(digit(n));
        }
    }
}
