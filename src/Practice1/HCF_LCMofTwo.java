package Practice1;

import java.util.Scanner;

//4] Take 2 numbers as inputs and find their HCF and LCM.
public class HCF_LCMofTwo {
    //FIRST APPROACH- Euclidean Algorithm for HCF
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("HCF & LCM of Two Number Program");
        System.out.println("Enter First Number - ");
        int a = in.nextInt();
        System.out.println("Enter Second Number - ");
        int b = in.nextInt();
        System.out.println("HCF - "+hcf(a,b)+" LCM - "+lcm(a,b,hcf(a,b) ));
    }
    //Euclidean Algorithm where num<den --> a<b

    static int hcf(int a,int b){

        if(a>b){
            int c = a;
            a=b;
            b=c;
        } // This if statement is only if 0 comes in numbers.
        int rem;
        while( a%b != 0){
            rem = a%b;
            a=b;
            b=rem;
        }
        return b;
    }

    static int lcm(int a,int b,int hcf){
        return (a*b)/hcf;
    }
}
  // SECOND APPROACH - By recurrsion Method It will be seen in reccursive part