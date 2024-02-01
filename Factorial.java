//import java.util.*;
//public class Factorial {
//    static int n1=0,n2=1,n3=0;
//    static void fibonacci(int x){
//        if(x>0){
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//            System.out.println(n3);
//            fibonacci(x-1);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the length:");
//        int n=sc.nextInt();
//        System.out.println(n1);
//        System.out.println(n2);
//        fibonacci(n-2);
//    }
//}





//public class Factorial {
//
//    public static void main(String[] args) {
//        int num = 6;
//        int factorial = multiplyNumbers(num);
//        System.out.println("Factorial of " + num + " = " + factorial);
//    }
//
//    public static int multiplyNumbers(int num) {
//        if (num == 1)
//            return 1;
//
//        else {
//
//            return num * multiplyNumbers(num - 1);
//        }
//    }
//}
// import java.util.*;
//public class Factorial{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("fibo series:");
//        int n=sc.nextInt();
//
//        for(int c=0;c<n;c++){
//            System.out.println(fibo(c)+" ");
//        }
//    }
//    public static int fibo(int n){
//        if(n<=1){
//            return n;
//        }
//        else{
//            return fibo(n-1)+ fibo(n-2);
//        }
//    }
//}

