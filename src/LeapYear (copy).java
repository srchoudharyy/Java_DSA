import java.util.Scanner;

//1] Input a year and find whether it is a leap year or not..
public class LeapYear {
    public  static void main(String[]args){
        //prompt user to enter year
        Scanner input = new Scanner(System.in); //scanner object created
        System.out.print("Enter a Year: ");
        int y = input.nextInt();
        boolean isleapyear = false;
        if ( y % 4 == 0 ){
          if ( y % 100 == 0) isleapyear = true;
        }

    }
}
