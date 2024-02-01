import java.util.*;
public class DecimalToOctal {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the length:");
            int length=sc.nextInt();
            int[] arr=new int [length];
            System.out.print("enter the decimal num:");
            int n=sc.nextInt();
            int i=0;
            int rem=0;
            while(n>0){
                rem=n%8;
                arr[i++]=rem;
                n=n/8;
            }
            System.out.println("the octal is:");
            for(int x=i-1;x>=0;x--){
//            System.out.println("\n");
                System.out.println(arr[x]);
            }
        }
    }

