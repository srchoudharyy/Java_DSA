import java.util.Scanner;

public class recursion_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter numb : ");
        int n = in.nextInt();
        if ( n == revnum(n)) System.out.println("It's Palindrome");
        else if ( n != revnum(n)) System.out.println("It's not Palindrome");
        else System.out.println("Please enter valid input");
    }

    static int revnum(int n){ // Eg. n= 2394, revnum fxn doit like => revnum(2394)= 4000+900+30+2
        if(n==0) return n;
        return(n%10)*digittimes10(n)+revnum(n/10);
    }
    static int digittimes10(int n){         //This helper function for function revnum that helps to revnum
        if (n/10==0) return 1;
        return 10*digittimes10(n/10);
    }

}
