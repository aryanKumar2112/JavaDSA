package DSA.D2Array;

public class TransposeOfMatrix {
    public static void printTranspose(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30}, {15, 25, 35}, {27, 29, 37}};
        printTranspose(matrix);
    }
}
