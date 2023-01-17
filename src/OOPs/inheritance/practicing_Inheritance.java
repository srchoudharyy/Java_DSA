package OOPs.inheritance;
class box{
    public double l=-1,w=-1,h=-1;
    box(){
    }
    public box(double l,double w,double h){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    public void info(){
        System.out.println("Box is 3D");
    }
}
class boxweight extends box{
    boxweight(){}
    double weight=-1;
    boxweight(double l,double w,double h, double weight){
        super(l,w,h);
        this.weight = weight;
    }
}
public class practicing_Inheritance {
    public static void main(String[] args) {
        box box0 = new box();
        boxweight box1 = new boxweight();
        boxweight box2 = new boxweight(10,20,10,2);
        System.out.println(box1.l);
        box1.info();

    }
}
