package OOPs.inheritance;

public class main {
    public static void main(String[] args) {
        Boxprice Box1=new Boxprice();
        System.out.println(Box1.weight+" "+ Box1.l);

        Boxprice Box2=new Boxprice(3,11,100);
        System.out.println(Box2.l);
    }
}
