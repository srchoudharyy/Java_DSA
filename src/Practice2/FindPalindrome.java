package Practice2;

import java.util.Scanner;

public class FindPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to find palindrome or not - ");
        int num = in.nextInt(), revnum=0 , rem , c=0 , quo;   //where c is counter, rem-reminder
        quo = num;
        while(true){
            if (quo == 0) break;
            rem = quo%10 ;
            revnum = 10*revnum + rem;
            quo = quo/10;
            c++;
        }
        System.out.println("Reversed Number - "+revnum);
        if(num == revnum) System.out.println("Palindrome Number");
        else System.out.println("Not Palindrome Number");
    }
    static int pwrfxn(int n, int i){  // such as n to the power i -recurssion method
        if( i==0 ) return 1;
        else return n*pwrfxn(n,i-1);
    }


}
