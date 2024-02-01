import java.util.*;
public class Factors {
//    static void factor(int n,int c){
//        if(n==1){
//          return  ;
//        }
//        if(n%c==0) {
//            System.out.println(c+" ");
//            factor(n/c , c);
//        }
//else{
//    factor(n/c,c+1);
//        }
//    }
public static void fact(int n,int c){
    if(c>=n){
        if(n%c==0){
            System.out.println(c);
           fact(n,c+1);
        }

    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int count=1;
        int num=sc.nextInt();
       fact(num,count);


    }
}
