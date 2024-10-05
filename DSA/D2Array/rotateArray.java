package DSA.D2Array;

public class rotateArray {
    public static void rotate(int matrix[][]) {
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }

        }

        for (int i = 0; i < transpose.length; i++) {
            int left = 0;
            int right = transpose[0].length - 1;
            while (left < right) {
                int temp = transpose[i][left];
                transpose[i][left] = transpose[i][right];
                transpose[i][right] = temp;
                left++;
                right--;
            }

        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
}
