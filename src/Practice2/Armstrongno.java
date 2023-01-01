package Practice2;

import java.util.Scanner;

public class Armstrongno {
    static int num1, d;  // Declaring outside of main fxn because it can usable accross all methods here d is no of dig
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter No. to Check wheather it's Armstrong or not - ");
        num1 = in.nextInt();
        d = noofdigits(num1);
        if( num1 == armstngno(num1)) System.out.println("It's Armstrong Number");
        else System.out.println("It's Not an Armstrong Number");
        System.out.println(armstngno(num1));
        System.out.println(d);
    }

    static int noofdigits(int num1){
        if(num1==0) return 0;
        return 1 + noofdigits(num1/10);
    }

    static int armstngno(int n){
        if( n==0 ) return 0;
        return pwrfxn(n%10,d) + armstngno(n/10);
    }

    static int pwrfxn(int n,int i){
        if(i==0) return 1;
        return n*pwrfxn(n,i-1);
    }
}
