public class GCD {
public static int hcf(int n1,int n2){
   if(n2!=0){
       return hcf(n2,n1%n2);
   }
   else{
       return n1;
   }
}

public static void main(String[] args) {
        int a=15;
        int b=10;
        int hcf=hcf(a,b);
        System.out.println("GCD of "+a+" and "+b+" is:"+hcf);
    }
}
