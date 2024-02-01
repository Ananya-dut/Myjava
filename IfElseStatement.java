import java.util.*;
public class IfElseStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int age=18;
//        boolean condition= (age==18);
//        if (condition) {
//            System.out.println("you can drive");
//        }
//      else{
//            System.out.println("you can't drive");
//        }
//        System.out.println("for logical AND...");
//        boolean a=false;
//        boolean b=true;
//        if(a && b){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("no");
//        }
//        System.out.println("for logical OR...");
//        if (a || b) {
//            System.out.println("yes");
//        }
//        else{
//                System.out.println("no");
//            }
//        System.out.println("for logical NOT...");
//        System.out.print("Not(a) is:");
//        System.out.println(!a);
//        System.out.print("Not(b) is:");
//        System.out.println(!b);

        System.out.println("enter your age:");
        int age=sc.nextInt();
        if(age>56){
            System.out.println("you are experienced!");

        }
        else if(age>46)  {
            System.out.println("you are semi-experienced!");

        }
        else if(age>36)  {
            System.out.println("you are semi-semi experienced" );

        }
        else {
            System.out.println("you are not experienced");
        }

    }
}
