abstract class shape{
    public abstract void calculatearea();
    public abstract void calculateperimeter();
}
class circle extends shape{
    private double radius;
    float pi=3.14f;
    circle(int r){
        radius=r;
    }
    public void calculatearea(){

        double a=pi*radius*radius;
        System.out.println("area of circle is:"+a);
    }
    public void calculateperimeter(){
        double pe=2*pi*radius;
        System.out.println("perimeter of circle is:"+pe);
    }
}
class rectangle extends shape{
    private double width;
    private double height;
    rectangle(int w,int h){
        width=w;
        height=h;
    }
    public void calculatearea(){
        double ar=width*height;
        System.out.println("area of the rectangle is:"+ar);
    }
    public void calculateperimeter(){
        double p=2*(height+width);
        System.out.println("perimeter of the rectangle is:"+p);
    }
}
public class instances {
    public static void main(String[] args) {
        circle obj=new circle(7);
        obj.calculatearea();
        obj.calculateperimeter();
        rectangle obj2=new rectangle(8,7);
        obj2.calculatearea();
        obj2.calculateperimeter();
    }
}
