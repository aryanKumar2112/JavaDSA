package DSA.Function;

import java.util.Scanner;

public class BinaryToDecim {
    public static void binToDec(int binNum){
        int lastdigit;
        int pow=0;
        int decimalNum=0;
        int num=binNum;
        while(binNum>0){
            lastdigit=binNum%10;
            decimalNum=decimalNum+(int)(lastdigit*Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal number of "+num+" is "+decimalNum);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binNum=sc.nextInt();
        binToDec(binNum);
    }
}
