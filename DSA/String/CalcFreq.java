package DSA.String;

public class CalcFreq {
    public static void main(String[] args) {
        String s="ABCDAADDEEADnjifriflffyrwamlwi";
        int []freq=new int[128];
        for (char ch:
             s.toCharArray()) {
            freq[ch]++;

        }
        for (int i=0;i< freq.length;i++){
            if(freq[i]!=0){
                System.out.println((char)i+"  "+freq[i]);
            }
        }


    }
}
