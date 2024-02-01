

//class Base{
//    int x;
//    void setX(int x){
//        System.out.println("I am in base and setting x now");
//      this. x=x;
//    }
//    int getX(){
//        return x;
//    }
//    void Base(){
//        System.out.println("I am a constructor");
//    }
//}
//class Derived extends Base{
//    int y;
//    void setY(int y){
//        System.out.println("I am in derived class and setting y");
//        this.y=y;
//    }
//    int getY(){
//        return y;
//    }
//}















class Animal{
    String type;
    int legAndHand;
    String color;
    void setType(String t){
       this.type=t;
    }
    String getType(){
        return type;
    }
    void setLegAndHand(int l){
        this.legAndHand=l;
    }
    int getLegAndHand(){
        return legAndHand;
    }
    void setColor(String c){
       this.color=c;
    }
    String getColor(){
        return color;

    }
}
class Dog extends Animal{
    String animalType;
    String sound;

     void setAnimalType(String a) {
        this.animalType = a;
    }
    String getAnimalType(){
         return animalType;
    }
    void setSound(String s){
         this.sound=s;
    }
    String getSound(){
         return sound;
    }
}
public class Inheritance {
    public static void main(String[] args) {
//        Base obj=new Base();

//obj.setX(4);
//        System.out.println(obj.getX());
//        Derived obj2=new Derived();
//        obj2.printMe();
//        obj2.setX(34);
//        System.out.println(obj2.getX());
//        obj2.setY(43);
//        System.out.println(obj2.getY());












        //Quick quize
        Animal ani=new Animal();
        Dog ani2=new Dog();
        ani.setType("animal");
        ani.setLegAndHand(4);
        ani.setColor("brown");
        ani2.setAnimalType("dog");
        ani2.setSound("bark");
        System.out.println("type is:"+ani.getType());
        System.out.println("total hand and leg number is:"+ani.getLegAndHand());
        System.out.println("color type is:"+ani.getColor());

        System.out.println("type of the animal is:"+ani2.getAnimalType());
        System.out.println("sound is:"+ani2.getSound());

    }
}
