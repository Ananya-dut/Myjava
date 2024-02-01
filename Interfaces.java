//interface Bicycle{
//    int a=45;
//    void applyBrake(int decrement);
//    void speedUp(int increment);
//}
//interface HornBicycle{
//    int x=45;
//    void blowHornk3g();
//    void blowHornmhn();
//}
//class AvonCycle implements Bicycle,HornBicycle{
//    public int x=5;
//    void blowHorn(){
//        System.out.println("pee pee poo poo");
//    }
//    public void applyBrake(int decrement){
//        System.out.println("Applying Brake");
//    }
//    public void speedUp(int increment){
//        System.out.println("Applying Speedup");
//    }
//    public void blowHornk3g(){
//        System.out.println("kabhi khushi kabhi gum pee pee pee pee");
//    }
//    public void blowHornmhn(){
//        System.out.println("main hoon naa po po po po");
//    }
//}






interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class Avoncycle implements Bicycle{
    int speed=7;
   public void applyBrake(int decrement){
       speed=speed-decrement;
       System.out.println("after applying brake the speed is:"+speed);
   }
   public void speedUp(int increment){
       speed=speed+increment;
       System.out.println("increasing spped is:"+speed);
   }
}
public class Interfaces {
    public static void main(String[] args) {
//        AvonCycle cycleHarry= new AvonCycle();
//        cycleHarry.applyBrake(1);
//        cycleHarry.speedUp(2);
//        System.out.println(cycleHarry.a);
//        System.out.println(cycleHarry.x);
//       // cycleHarry.a=454;
//       // System.out.println(cycleHarry.a);
//        cycleHarry.blowHornk3g();
//        cycleHarry.blowHornmhn();



        Avoncycle obj=new Avoncycle();
        System.out.println("previous speed is:"+obj.speed);
        obj.applyBrake(2);
        obj.speedUp(1);
        System.out.println("current speed is:"+obj.speed);


    }
}
