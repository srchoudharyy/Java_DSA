package Practice1;

import java.util.Scanner;

// 5] Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class SumofUserNos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value to sum - ");
        int sum=0 ;
        while(true){
            String value = in.next();
            if(value.equalsIgnoreCase("x"))   break;
            sum = sum + Integer.parseInt(value);
        }
        System.out.println("Sum - "+sum);
    }
}
