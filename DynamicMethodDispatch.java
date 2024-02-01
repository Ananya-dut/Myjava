class Phone{
    public void showTime(){
        System.out.println("time is 8 a.m");
    }
    public void on(){
        System.out.println("turning on phone......");
    }
}
class SmartPhone extends Phone{
    public void on(){
        System.out.println("turning on smartphone.....");
    }
    public void music(){
        System.out.println("playing music.....");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj=new SmartPhone();//allowed(this called dynamic method dispatch)
//        Smartphone obj=new phone();//not allowed
//        phone obj=new phone();//allowed
        SmartPhone obj2=new SmartPhone();//allowed
        obj.on();
        obj.showTime();
        obj2.music();
    }
}
