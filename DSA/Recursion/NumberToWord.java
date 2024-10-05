package DSA.Recursion;

public class NumberToWord {
    public static void printWord(String arr[],int n,String num,int i,StringBuilder str){
        if(num.length()==i){
            System.out.println(str);
            return;
        }
        char ch = num.charAt(i);

        printWord(arr,n,num,i+1,str.append(arr[ch-'0']));
    }
    public static void main(String[] args) {
        String arr[]={"zero ","one ","two ","three ","four ","five ","six ","seven ","eight ","nine "};
        printWord(arr,0,"2019",0,new StringBuilder(""));
    }
}
