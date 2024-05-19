package ReDrag;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float num1, num2;
        String op;
        Scanner sc = new Scanner(System.in);
        num1 = getNumber(sc, "Input number 1: ");
        num2 = getNumber(sc, "Input number 2: ");
        op = getOperator();
        float result = calculate(num1, num2, op);
        displayResult(num1, num2, op, result);
    }

    private static float getNumber(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextFloat();
    }

    private static String getOperator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the operator(+-*/): ");
        return sc.nextLine();
    }

    private static float calculate(float num1, float num2, String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error! Dividing by zero is not allowed.");
                    System.exit(0);
                }
            default:
                System.out.println("Error! Invalid operator. Only +, -, * and / are allowed.");
                System.exit(0);
        }
        return 0;
    }

    private static void displayResult(float num1, float num2, String op, float result) {
        System.out.println("The result of " + num1 + op + num2 + " = " + result);
    }
}