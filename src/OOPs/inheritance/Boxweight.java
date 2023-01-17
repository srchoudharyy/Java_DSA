package OOPs.inheritance;

public class Boxweight extends Box{
    double weight;
    Boxweight(){ this.weight=10;}
    Boxweight(double side, double weight){super(side); this.weight=weight; }
    Boxweight(double l, double w, double h, double weight){super(l,w,h); this.weight=weight; }
    Boxweight(Box old,double weight){super(old); this.weight=weight; }
}
