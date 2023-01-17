import java.util.Scanner;

public class recursion_findsortedarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers to form Array - ");
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) arr[i]=in.nextInt();
        System.out.println("Assending-"+methodIIasc(arr,0));
        System.out.println("Decending-"+findsortdec(arr,arr.length-1));
    }
    static boolean findsortass(int[] arr,int a){
        if(a==arr.length-1) return true;
        else if (arr[a]<arr[a+1]) return findsortass(arr,++a);
        else return false;
    }
    static boolean findsortdec(int[] arr,int a){
        if(a==0) return true;
        else if (arr[a]<arr[a-1]) return findsortdec(arr,--a);
        else return false;
    }
    static boolean methodIIasc(int[] arr, int index){
        if( index == arr.length-1 ) return true;
        return arr[index]<arr[index+1] && methodIIasc(arr,++index);
    }
}
