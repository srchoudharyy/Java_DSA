package Practice1;

import java.util.Scanner;

//3] Take a number as input and print the multiplication table for it. 
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter No. to Print Multiplication Table - ");
        int num = in.nextInt();
        System.out.println("Table - ");
        Mtable(num); //function is taking value num and calling to method "Mtable"
    }
    static void Mtable(int num){  //Here Mtable is called and it executes
        for (int i = 1 ; i < 11 ; i++) {
            int value = num * i;
            System.out.println(num+" * "+i+" = "+value );
        }
    }
}
