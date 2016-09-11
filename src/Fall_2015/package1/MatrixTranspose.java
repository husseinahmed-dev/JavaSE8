package Fall_2015.package1;

/**
 * Created by Hussein on 6/2/15.
 */
public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        displayMatrix(matrix, "Before Transpose");
        transpose(matrix);
        displayMatrix(matrix, "After Transpose");
    }

    public static void displayMatrix(int[][] array, String header) {
        System.out.println(header);
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.printf("%d ", array[row][col]);
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < row; col++) {
                int temp = array[row][col];
                array[row][col] = array[col][row];
                array[col][row] = temp;
            }
        }
    }
}
