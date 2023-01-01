package Practice3;

import java.util.Scanner;

public class Revstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String - ");
        String str = in.next(), revstr="";
        for (int i = str.length()-1; i >= 0 ; i--) {
            revstr += str.charAt(i);
        }
        System.out.println(revstr);
    }
}
