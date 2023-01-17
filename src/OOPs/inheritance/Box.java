package OOPs.inheritance;

public class Box {
    double l,w,h;
    Box(){ this.l=-1; this.w=-1; this.h=-1;}
    Box(double side){ this.l=side; this.w=side; this.h=side;}
    Box(double l, double w, double h){ this.l=l; this.h=h; this.w=w;}
    Box(Box old){this.l= old.l; this.h= old.h; this.w= old.w; }
}
