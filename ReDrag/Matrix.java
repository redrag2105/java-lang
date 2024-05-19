package ReDrag;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Matrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int rows = getDimension(sc, "Enter the number of rows: ");
            int cols = getDimension(sc, "Enter the number of columns: ");
            int[][] matrix = getMatrix(rows, cols);

            inputMatrix(sc, matrix);
            displayMatrix(matrix);

            int sum = getSum(matrix);
            float average = getAverage(sum, matrix.length, matrix[0].length);
            printResult(sum, average);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }

    public static int getDimension(Scanner sc, String prompt){
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static int[][] getMatrix(int rows, int cols){
        return new int[rows][cols];
    }

    private static void inputMatrix(Scanner sc,int[][] matrix) {
        System.out.println("Enter the matrix: ");
        for (int i =0; i < matrix.length; i++){
            for (int j =0; j < matrix[i].length; j++){
                System.out.print("m[" + i + "][" + j + "]= ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    private static void displayMatrix(int[][] matrix) {
        System.out.println("Matrix inputted: ");
        int i =0;
        while (i < matrix.length) {
            for (int j =0; j < matrix[i].length; j++){
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println("\n");
            i++;
        }
    }

    private static int getSum(int[][] matrix) {
        int sum = 0;
        int i = 0;
        while (i < matrix.length) {
            for (int j =0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
            i++;
        }
        return sum;
    }

    private static float getAverage(int sum, int rows, int cols) {
        return (float)sum / (float)(rows*cols);
    }

    private static void printResult(int sum, float average) {
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}