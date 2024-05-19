/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Part1 {
    public static void main(String[] args) {
        int rows;
        int cols;
        int[][] matrix;

        rows = getRows();
        cols = getCols();
        matrix = getMatrix(rows, cols);

        inputMatrix(matrix, rows, cols);
        displayMatrix(matrix, rows, cols);

        int sum = getSum(matrix, rows, cols);
        float average = getAverage(sum, rows, cols);
        printResult(sum, average);
    }

    public static int getRows(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        return sc.nextInt();
    }

    public static int getCols(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of columns: ");
        return sc.nextInt();
    }

    public static int[][] getMatrix(int rows, int cols){
        return new int[rows][cols];
    }

    private static void inputMatrix(int[][] matrix, int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix: ");
        for (int i =0; i < rows; i++){
            for (int j =0; j < cols; j++){
                System.out.print("m[" + i + "][" + j + "]= ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    private static void displayMatrix(int[][] matrix, int rows, int cols) {
        System.out.println("Matrix inputted: ");
        for (int i =0; i < rows; i++){
            for (int j =0; j < cols; j++){
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println("\n");
        }
    }

    private static int getSum(int[][] matrix, int rows, int cols) {
        int sum = 0;
        for (int i = 0; i < rows; i++){
            for (int j =0; j < cols; j++){
                sum += matrix[i][j];
            }
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
