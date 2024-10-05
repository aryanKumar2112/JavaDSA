package DSA.D2Array;

public class Rotate {
    public static void rotate(int[][] matrix) {
        int[][] arr= new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            int x=matrix.length-1-i;
            for(int j=0;j<matrix.length;j++){
                arr[j][x]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=arr[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
}
