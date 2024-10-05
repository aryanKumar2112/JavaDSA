package DSA.Hashing;

import java.util.HashSet;

public class CountDistinctElem {
    public static void main(String[] args) {
        int num[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer>set1=new HashSet<>();
        for (int i = 0; i < num.length; i++) {
         set1.add(num[i]);
        }
        System.out.printf("ans= "+set1.size());
    }
}
