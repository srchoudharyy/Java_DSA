package Practice1;

import java.util.Scanner;// class Scanner imported from java util package to get input
public class Sumoftwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  //creating object 'in' to get input using this object
        System.out.print("Enter First Number - ");
        int a = in.nextInt();
        System.out.print("Enter Second Number - ");
        int b = in.nextInt();
        int c = a + b;
        System.out.print("Sum of two numbers - "+ c);
    }
}
