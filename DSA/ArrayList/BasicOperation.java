package DSA.ArrayList;

import java.util.ArrayList;

public class BasicOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //Get Operation
//        int element=list.get(2);
//        System.out.println(element);

        //remove operation
//        list.remove(2);
//        System.out.println(list);

        // contains element in list
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //Add element at particular index
        list.add(1,9);
        System.out.println(list);

        //list.size() method
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
