package Practice3;

import java.util.Scanner;

public class nCr_nPr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of n - ");
        int n = in.nextInt();
        System.out.println("Enter value of r - ");
        int r = in.nextInt();
        int permutation = factorial(n)/factorial(n-r);
        int combination = permutation/factorial(r);
        System.out.println("nPr = "+permutation);
        System.out.println("nCr = "+combination);
    }

    static int factorial(int value){
        if(value==0) return 1;
        return value * factorial(value-1);
    }
}
