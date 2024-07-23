public class subarray{

    public static void sub_array(int num[]){

        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                for(int k=i; k<=j; k++){
                    System.err.print(num[k]+" ");
                }
                System.out.println(" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        
        int num[] = {10,20,30,40,50,60,70,80,90};
        sub_array(num);
    }
}

