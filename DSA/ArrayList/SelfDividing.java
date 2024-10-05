package DSA.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SelfDividing {
    //when method is static we use this approach
    //public static  ArrayList<Integer> selfDividingNumbers(int left, int right)
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n=i;
            boolean isSelfDividing = true;
            while(n>0){
                int rem=n%10;
                n=n/10;
                if(rem==0 || i%rem!=0){
                    isSelfDividing= false;
                    break;
                }


            }
            if(isSelfDividing){
                list.add(i);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        //because method is not static that's why i use this method
        SelfDividing selfDividing = new SelfDividing();
        List<Integer> result = selfDividing.selfDividingNumbers(1, 22);
        System.out.println(result);



        //when method is static we use this approach
      //  System.out.println(selfDividingNumbers(1,22));

    }
}
