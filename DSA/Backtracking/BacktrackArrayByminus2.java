package DSA.Backtracking;

public class BacktrackArrayByminus2 {
    public static void changeArr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printArray(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;// The backtracking step executes after the return statement by the base case.
        // The above two steps(inside recursion) are not executed at that time because both steps are already executed previously.

    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArr(arr,0,1);
        printArray(arr);

    }
}
