package DSA.Hashing;

import java.util.HashSet;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,1,2,3};
        int arr2[]={1,1,2,4,5};
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>result=new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])){
                result.add(arr2[i]);
            }
        }
        System.out.println(result);
        for (int k :result){
            System.out.println(k);
        }
    }
}
