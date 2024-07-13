import java.util.*;
public class binary_to_decimal {
    public static int convert(int n){
        int power = 0;
        int dec = 0;
        while (n>0){
            int ld = n%10;
            dec = dec + (ld * (int)Math.pow(2,power));
            n = n/10;
            power ++;
        }
        return dec;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n =sc.nextInt();
            System.out.println(convert(n));
        }
    }
}
