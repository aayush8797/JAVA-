public class prefix_sum{

    public static void max_sum(int num[]){
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0]=num[0];

        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+num[i];
        }

        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                if(i==0){
                    currSum = prefix[j];
                }
                else{
                    currSum = prefix[j] - prefix[i-1];
                }
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum is : "+ maxSum);
    }

    public static void main(String[] args) {
        
        int num[] = {1,-2,6,-1,3};
        max_sum(num);
    }
}


