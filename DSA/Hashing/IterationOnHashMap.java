package DSA.Hashing;
import java.util.*;
public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Us",50);
        hm.put("Russia",55);

        Set<String>keys=hm.keySet();
        System.out.println(keys);

        for(String k :keys){
            System.out.println(" Key = "+ k+" Value = "+hm.get(k));
        }

    }
}
