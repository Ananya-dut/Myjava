import java.io.IOException;
import java.util.*;
class NegativeRadiousException extends Exception{
    @Override
    public String toString() {
        return "radious can't be negative";
    }
    @Override
    public String getMessage() {
        return "radious can't be negative";
    }
}
public class throw_throws {
//    public static int div(int a,int b){
//        if(b==0){
//            throw new ArithmeticException("div by 0");
//        }
//        else{
//            return a/b;
//        }
//    }
//    public static void calculate(int a, int b) throws IOException{
//        int c=a/b;
//        System.out.println("result is:"+c);
//    }
//    public static double area(int r) throws NegativeRadiousException{
//        if(r<0){
//            throw new NegativeRadiousException();
//        }
//        else{
//            double result=Math.PI*r*r;
//            return result;
//        }
//    }
    public static int div(int a, int b) throws ArithmeticException{
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
//        int c=div(6,2);
//        System.out.println("result is:"+c);
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the value of a:");
//        int a1=sc.nextInt();
//        System.out.println("enter the value of b:");
//        int b1=sc.nextInt();
//        try {
//            calculate(a1, b1);
//        }
//        catch(Exception e){
//            System.out.println("type of exception is:"+e);
//        }
//        try {
//            double r = area(-1);
//            System.out.println("result is:"+r);
//        }
//        catch(Exception e){
//            System.out.println("exception is:"+e);
//        }
        try {
            int c = div(8, 4);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
