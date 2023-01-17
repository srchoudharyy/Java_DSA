import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class recursion_SearchInArray {
    static ArrayList<Integer> findlist=new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array- ");
        int[] arr=new int[7];
        for (int i = 0; i < arr.length; i++) arr[i]=in.nextInt();
        System.out.println("Enter Target- ");
        int t = in.nextInt(), i=0;
        ArrayList<Integer> findlistII = new ArrayList<>();
        findfunctionII(arr,t,i,findlistII);
        System.out.println(findlistII);
    }
    static void findfunction(int[] arr, int t, int i){
        if(i==arr.length) return;
        else if(arr[i]==t) findlist.add(i);
        findfunction(arr,t,++i);
    }
    static ArrayList<Integer> findfunctionII(int[] arr, int t, int i, ArrayList<Integer> list){
        if(i==arr.length) return list;
        else if(arr[i]==t) list.add(i);
        return findfunctionII(arr,t,++i,list);
    }
}
