package DSA.Array;

public class KadanesAlgorithm {
    public static void printMaxSub(int numbers[]){
        int maxsum=Integer.MIN_VALUE;
        int currSum=0;


        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];


            if (currSum < 0) {
                currSum = 0;
            }
            if (maxsum < currSum) {
                maxsum = currSum;
            }
        }

//        //for negative or positive both
//            for (int i = 0; i < numbers.length; i++) {
//                currSum+=numbers[i];
//
//                if(maxsum<currSum){
//                    maxsum=currSum;
//                }
//                if(currSum<0){
//                    currSum=0;
//                }
//        }



        System.out.println("Maximum subArray sum is "+maxsum);
    }

    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        printMaxSub(numbers);

    }
}
