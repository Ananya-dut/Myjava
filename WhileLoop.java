import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
//        System.out.println("using while loop");
//        int i=100;
//        while (i<=200){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("finish running while loop!");
//        System.out.println("using do-while loop");
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the length of num:");
//        int n=sc.nextInt();
//        int b=1;
//        do{
//            System.out.println(b);
//            b++;
//        }
//        while(b<=n);
        System.out.println("using for loop");
        System.out.println("enter the length of the num:");
        int n=sc.nextInt();
//        for (int i=1;i<=10;i++){
//            System.out.println(i);
//        }
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }

    }
}
