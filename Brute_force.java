public class Brute_force{

    public static void max_sum(int num[]){
        int currSum;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                currSum=0;
                for(int k=i; k<=j; k++){
                    System.out.print(num[k]+" ");
                    currSum += num[k];
                }
                System.out.println("\nSum is : "+currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println("");
        }
        System.out.println("Max Sum is : "+ maxSum);
    }

    public static void main(String[] args) {
        
        int num[] = {1,-2,6,-1,3};
        max_sum(num);
    }
}


