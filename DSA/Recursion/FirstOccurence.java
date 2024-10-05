package DSA.Recursion;

public class FirstOccurence {
    public static int firstOccur(int arr[],int key,int i){
        if(arr.length==i){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccur(arr,5,0));
    }
}
