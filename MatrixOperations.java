import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for matrix 1:");
        int rows1 = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix 1:");
        int cols1 = scanner.nextInt();

        int[][] matrix1 = inputMatrix(rows1, cols1, scanner);

        System.out.println("Enter the number of rows for matrix 2:");
        int rows2 = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix 2:");
        int cols2 = scanner.nextInt();

        int[][] matrix2 = inputMatrix(rows2, cols2, scanner);

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Number of columns in matrix 1 must be equal to the number of rows in matrix 2.");
            return;
        }

        int[][] sum = addMatrices(matrix1, matrix2);
        int[][] product = multiplyMatrices(matrix1, matrix2);

        System.out.println("\nMatrix Sum:");
        printMatrix(sum);

        System.out.println("\nMatrix Product:");
        printMatrix(product);

        scanner.close();
    }

    // Function to input matrix elements
    public static int[][] inputMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Function to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Function to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
