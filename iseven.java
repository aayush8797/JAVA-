import java.util.*;
public class iseven {
    public static boolean is_even(int a){
        return a%2==0;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            System.out.println(is_even(a));
        }
    }
}