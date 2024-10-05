package DSA.Recursion;

public class BinaryStringProblem {
    public static void printBinString(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        //kaam
//        if (lastPlace==0){
//            printBinString(n-1,0,str+"0");
//            printBinString(n-1,1,str+"1");
//        }
//        else{
//            printBinString(n-1,0,str+"0");
//        }

        //optimized way
        printBinString(n-1,0,str+"0");
        if (lastPlace==0){

           printBinString(n-1,1,str+"1");
        }

    }
    public static void main(String[] args) {
        printBinString(3,0,"");
    }
}
