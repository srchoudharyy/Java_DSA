package OOPs.inheritance;

public class Boxprice extends Boxweight{
    double price;
    Boxprice(){ this.price=-1; }
    Boxprice(double side, double weight, double price){ super(side, weight); this.price=price; }

    Boxprice(double l, double w, double h, double weight, double price) { super(l, w, h, weight); this.price=price; }

    Boxprice(Box old, double weight, double price) { super(old, weight); this.price=price; }
}
