package DSA.Hashing;

//import java.util.HashMap;
import java.util.*;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("Bhutan",25);

        HashMap<String , Integer>hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Bhutan",25);

        System.out.println(hm);
        System.out.println(lhm);
    }
}
