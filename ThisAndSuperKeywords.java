class EkClass{
    int a;
    public int returnone(){
        return 1;
    }
    EkClass(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}
public class ThisAndSuperKeywords {
    public static void main(String[] args) {
        EkClass e=new EkClass(65);
        DoClass d=new DoClass(5);
        System.out.println(d.returnone());
//        System.out.println(e.getA());
        System.out.println(d.getA());
    }
}
