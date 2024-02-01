import java.util.*;
public class krishnamurthy {
    static Scanner sc =new  Scanner(System.in);
    public static void main(String[] args){
        System.out.print("enter the number:");
        int x=sc.nextInt();
        int m=x;
        int s=0;
        while(x!=0){
            int r=x%10;
            int f=1;
            for(int i=1;i<=r;i++){
                f=f*i;

            }
            s=s+f;
            x=x/10;
        }
        if(s==m){
            System.out.println(m+" "+"is a krisnamurthy num");
        }
        else{
            System.out.println(m+" "+"is not a krisnamurthy num");
        }
    }
    
}
