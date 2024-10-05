package DSA.Array;

public class Stock {
    public static void main(String[] args) {
        int nums[]={7,1,5,3,6,4};
        int buy=nums[0];
        int profit=0;
        for(int i=1;i< nums.length;i++){
            if(nums[i]<buy){
                buy=nums[i];
            }
            else{
                int temp=nums[i]-buy;
                if(temp>profit){
                    profit=temp;
                }
            }
        }
        System.out.println(profit);
    }
}
