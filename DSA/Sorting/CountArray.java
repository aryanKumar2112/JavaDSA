package DSA.Sorting;

public class CountArray {
    public static void countArray(int a[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            largest=Math.max(largest,a[i]);
        }
        int count[]=new int[largest+1];
        for (int i = 0; i < a.length; i++) {
           count[a[i]]++;
        }
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printCountArray(int arr[]){
        for (int i = 0;  i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        countArray(arr);
        printCountArray(arr);

    }
}
