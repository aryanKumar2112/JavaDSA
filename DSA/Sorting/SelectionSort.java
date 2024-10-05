package DSA.Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            int minpos=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[minpos]>arr[j]){
                    //here we change sign < then print 5 4 3 2 1
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
    }
    }
    public static void printSelectionSort(int arr[]){
        for (int temp:
             arr) {
            System.out.print(temp+" ");
        }
    }

    public static void main(String[] args) {
       int arr[]={5,4,1,3,2};
       selectionSort(arr);
       printSelectionSort(arr);

        }

}
