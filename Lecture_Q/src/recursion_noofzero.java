import java.util.Scanner;

public class recursion_noofzero {
    static int c=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num : ");
        int n = in.nextInt();

        System.out.println(method2(n));
    }
    static int noofzero(int n){
        if ( n==0 ) return 0;
        if ( n%10 == 0 ) c++;
        return noofzero(n/10);
    }
    static int method2(int n){
        int c=0;
        return method2helper(n,c);
    }
    static int method2helper(int n, int c){
        if(n==0) return c;
        else if (n%10==0) c++;
        return method2helper(n/10,c);
    }
}
