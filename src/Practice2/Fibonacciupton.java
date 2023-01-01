package Practice2;

import java.util.Scanner;

public class Fibonacciupton {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much fibbonacci numbers list you want - ");
        int n = in.nextInt(), a=0, b=1, c;
        for (int i = 0; i < n; i++) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
