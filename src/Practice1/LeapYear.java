package Practice1;

import java.util.Scanner;



//1] Input a year and find whether it is a leap year or not......
public class LeapYear {
/*  FIRST APPROACH
      public  static void main(String[]args){
        Scanner in = new Scanner(System.in); // object created 'in' to get inpur using Scanner Class
        System.out.print("Enter Year to find which is Leap year or not - ");
        int year = in.nextInt();
        if ( year % 400 != 0){
            if( year % 100 != 0) {
                if ( year % 4 != 0) System.out.print("Year - "+year+"- Not Leap Year");
                else System.out.print("Year - "+year+"- Leap Year");
            }
            else System.out.print("Year - "+year+"- Not Leap Year");
        }
        else System.out.print("Year - "+year+"- Leap Year");

    }
}
*/
/* SECOND APPROACH
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // object created 'in' to get inpur using Scanner Class
        System.out.print("Enter Year to find which is Leap year or not - ");
        int year = in.nextInt();
        if(year % 400 == 0) System.out.print("It's Leap Year");
        else if(year % 100 == 0) System.out.print("It's Not Leap Year");
        else if(year % 4 == 0) System.out.print("It's Leap Year");
        else System.out.print("It's Not Leap Year");
    }
*/
    // THIRD APPROACH- OPTIMIZED TO NEXT LEVEL
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("Please Enter Year - ");
    int year=in.nextInt();
    if ( ( year%4 == 0 && year%100 != 0) || year%400 == 0) System.out.println("It's Leap Year");
    else System.out.println("It's not Leap Year");
}

    }