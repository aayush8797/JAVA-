import java.util.*;
public class decimal_to_binary {
    public static int convert(int n){
        int binary =0;
        int power=0;
        while(n>0){
            int num = n%2;
            binary = (int) (binary + num*Math.pow(10,power));
            power++;
            n = (int)(n/2);
        }
        return binary;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n =sc.nextInt();
            System.out.println(convert(n));
        }
    }
}