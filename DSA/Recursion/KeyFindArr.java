package DSA.Recursion;

public class KeyFindArr {
    public static void printKeyIdx(int arr[],int key,int i){
        //base case
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.println(i);
        }
        printKeyIdx(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        printKeyIdx(arr,2,0);
    }
}
