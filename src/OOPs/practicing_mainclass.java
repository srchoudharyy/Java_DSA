package OOPs;
class Singleton_A{
    private Singleton_A(){
    }
    private static Singleton_A onlyOne;
    public static Singleton_A createObj(){
        if (onlyOne == null ){
            onlyOne = new Singleton_A();
        }
        return onlyOne;
    }
}


public class practicing_mainclass {
    public static void main(String[] args ) {
        System.out.println("hi");
        Singleton_A a = Singleton_A.createObj();
        Singleton_A b = Singleton_A.createObj();
        Singleton_A c = Singleton_A.createObj();
        System.out.println(a+" "+b+" "+c);
    }

}
