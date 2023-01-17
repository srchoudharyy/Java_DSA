import java.util.Scanner;

public class Recurrsion_revnum {
    static int sum = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter numb : ");
        int n = in.nextInt();
        System.out.println(revnum(n));
        method2(n);
        System.out.println(sum);
    }
    static int revnum(int n){ // Eg. n= 2394, revnum fxn doit like => revnum(2394)= 4000+900+30+2
        if(n==0) return n;
        return(n%10)*digittimes10(n)+revnum(n/10);
    }
    static int digittimes10(int n){         //This helper function for functi on revnum that helps to revnum
        if (n/10==0) return 1;
        return 10*digittimes10(n/10);
    }

    static int method2(int n){
        if(n==0) return 0;
        int rem = n%10;
        sum = sum*10 + rem;
        return method2(n/10);
    }
}