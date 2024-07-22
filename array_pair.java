public class array_pair{

    public static void pair(int num[]){

        for(int i=0; i<num.length;i++){
            for(int j=i+1; j<num.length;j++){
                System.out.print("("+num[i]+","+num[j]+")");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        
        int num[] = {10,20,30,40,50,60,70,80,90};
        pair(num);
    }
}