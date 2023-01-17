import java.util.ArrayList;
import java.util.Scanner;

public class IMP_findinArray {
    //This is going to IMP or VVP-Very very important because here we are going to return ArrayList without taking it
    // in argument
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array- ");
        int[] arr=new int[7];
        for (int i = 0; i < arr.length; i++) arr[i]=in.nextInt();
        System.out.println("Enter Target- ");
        int t = in.nextInt(), i=0;
        System.out.println(find_fxn(arr,t,i));
    }
    static ArrayList<Integer> find_fxn(int[] arr, int t, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length) return list;
        if ( arr[i]==t ) list.add(i);
        ArrayList<Integer> belowans = find_fxn(arr,t,++i);
        list.addAll(belowans);
        return list;
    }
}
