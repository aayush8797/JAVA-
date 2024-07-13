import java.util.*;
public class input_output_update {
    public static void main(String[] args) {
        int marks[] = new int[100];
        try(Scanner sc = new Scanner(System.in)){
            marks[0]=sc.nextInt();
            marks[1]=sc.nextInt();
            marks[2]=sc.nextInt();

            System.out.println("BEE : "+ marks[0]);
            System.out.println("python : "+ marks[1]);
            System.out.println("DSA : "+ marks[2]);

            marks[1] = 80;
            System.out.println("python : "+ marks[1]);
        }
    }
}