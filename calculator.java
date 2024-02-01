import java.util.*;
public class calculator {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter the 1st num");
        int a=sc.nextInt();
        System.out.println("enter the 2nd num");
        int b=sc.nextInt();
        int x1=a+b;
        int x2=a-b;
        int x3=a*b;
        int x4=a/b;
        int x5=a%b;
        System.out.println("choice the operation");
        System.out.println("1:add\n2:sub\n3:mull\n4:div\n5:modu");
        int button=sc.nextInt();
         {       
        switch(button){
            case 1:
                   System.out.println("addition="+x1);
                   break;
            case 2:
                   System.out.println("sub="+x2);
                   break;
            case 3:
                   System.out.println("mull="+x3);
                   break;
            case 4:
                   System.out.println("divide="+x4);
                   break;
            case 5:
                   System.out.println("modeulo="+x5);
                   break;
            default:System.out.println("invalid button");
                    break;                       
        }
       }
    }
    
}
