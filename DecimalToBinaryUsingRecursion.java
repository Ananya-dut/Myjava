import java.util.*;
public class DecimalToBinaryUsingRecursion {
    static int dtb(int n){

        if(n>0){
int binary=n%2+10*(dtb(n/2));
return binary;

        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the decimal number:");
        int num=sc.nextInt();

        int b=dtb(num);
        System.out.println("binary is:"+b);

    }
}
