import java.util.*;
public class avg_fuct {
    public static float average(float a , float b , float c){
        float avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            System.out.println(average(a, b, c));
        }
    }
}
