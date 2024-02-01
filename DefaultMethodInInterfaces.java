//interface MyCamera{
//    void takeSnap();
//    void recordVideo();
//    //we can use private method and default method in interfaces.....interfaces can also include private methods for default methods to use.
//    private void greet(){
//        System.out.println("Good Morning");
//    }
//    default void record4kVideo(){
//        greet();
//        System.out.println("recording in 4k...");
//    }
//}
//interface MyWifi{
//    String[] getNetworks();//string array data type taken for storing the data
//    void connectToNetwork(String network);
//}
//class MyCellPhone{
//    void callNumber(int phoneNumber){
//        System.out.println("calling "+phoneNumber);
//    }
//    void pickCall(){
//        System.out.println("connecting...");
//    }
//}
//class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
//    public void takeSnap(){
//        System.out.println("taking snap");
//    }
//    public void recordVideo(){
//        System.out.println("taking snap");
//    }
//    //it return a string datatype
//    public String[] getNetworks(){
//        System.out.println("getting list of network:");
//        String[] networkList={"Harry","Prashanth","Anjali5G"};//data are store in networklist like array(important part)
//        return networkList;
//    }
//    public void connectToNetwork(String network){
//        System.out.println("connecting to "+network);
//    }
//}










interface Animal1{
    default void say(){
        System.out.println("hello,this is default method");
    }
    void bark();
}
class CWH implements Animal1{
    public void bark(){
        System.out.println("Dog barks!");
    }
}
public class DefaultMethodInInterfaces {
    public static void main(String[] args) {
//MySmartPhone ms=new MySmartPhone();
//ms.takeSnap();
//ms.recordVideo();
//ms.record4kVideo();
//String[] ar=ms.getNetworks();//the return list is store in ar
// //for printing the data use for-each loop that has a datatype called string,all the item one by one traverse in ar and increment....print the item in the loop
//for(String item:ar){
//    System.out.println(item);
//}
//ms.connectToNetwork("Airtel");
//ms.callNumber(9004);
//ms.pickCall();






        CWH obj=new CWH();
        obj.say();
        obj.bark();
    }
}
