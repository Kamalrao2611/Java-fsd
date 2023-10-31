package com.matrixmultiplication;

public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] secondMatrix = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int[][] resultMatrix = multiplyMatrices(firstMatrix, secondMatrix);

        System.out.println("Resultant Matrix:");
        printMatrix(resultMatrix);
    }

    static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int row1 = firstMatrix.length;
        int col1 = firstMatrix[0].length;
        int row2 = secondMatrix.length;
        int col2 = secondMatrix[0].length;

        if (col1 != row2) {
            throw new IllegalArgumentException("The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
        }

        int[][] resultMatrix = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return resultMatrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
