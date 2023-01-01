package Practice2;

import java.util.Scanner;

//4] Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Operationonnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers - ");
        int a = in.nextInt(), b = in.nextInt();
        System.out.println("Enter Operation to perform - ");
        String operation = in.next();
        switch (operation) {
            case "+" -> {
                int sum = a + b;
                System.out.println("Sum - " + sum);
            }
            case "-" -> {
                int diff = a - b;
                System.out.println("Diff - " + diff);
            }
            case "*" -> {
                int prd = a * b;
                System.out.println("Product - " + prd);
            }
            case "/" -> {
                double frac = a / b;
                System.out.println("Div - " + frac);
            }
        }
    }
}
