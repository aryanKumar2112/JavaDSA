package DSA.pattern;

public class HollowRectangle {
    public static void main(String[] args) {
       /*for (int i = 1; i <5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if(i==1||j==1||i==4||j==5){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();

        }*/

       /* for (int i = 1; i <=4 ; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }*/

        /*for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5-i+1 ; j++) {
                System.out.print(j);
            }
            System.out.println();

        }*/

        /*
        int num=1;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }*/

        // 1 01 101 0101 10101 pattern
        int num=1;
        for (int i = 1; i <=8; i++) {
            for (int j = 1; j <=i ; j++) {
                num=num%2;
                System.out.print(num);
                num++;

            }
            if(i%2==0){
                num++;
            }

            System.out.println();

        }
    }
}
