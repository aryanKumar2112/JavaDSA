package DSA.String;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String str="asdfvcmvmm";
        char arr[]=str.toCharArray();
        System.out.println(Arrays.toString(arr));

        //Array to string conversion
        String s1=new String(arr);
        System.out.println(s1);
    }
}
