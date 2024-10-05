package DSA.D2Array;

public class SumOfDiagonal {
    public static void printDiagSum(int nums[][]){
        int sum=0;
//       for (int i=0;i<nums.length;i++){
//           for(int j=0;j<nums[0].length;j++){
//               if(i==j){
//                  sum+=nums[i][j];
//               } else if (i+j==nums.length-1) {
//                   sum+=nums[i][j];
//               }
//           }
//       }

        for (int i = 0; i < nums.length; i++) {
            //primary
            sum+=nums[i][i];
            if(i!= nums.length-1-i){
                sum+=nums[i][nums.length-1-i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int nums[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printDiagSum(nums);
    }
}
