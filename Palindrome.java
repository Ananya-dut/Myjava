import java.util.*;
class Palin{
    int num;
    int revnum;
    Palin(){
        this.num=num;
        this.revnum=revnum;
    }
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
         num=sc.nextInt();
    }
    public int reverse(int y){
        if(y==0){
            return revnum;
        }

            revnum=(revnum*10)+y%10;
        return reverse(y/10);
    }
    public void check(){
        int temp=reverse(num);
        if(revnum==num){
            System.out.println("it is a palindrome number");
        }
        else{
            System.out.println("it is not a palindrome number");
        }
    }
}
public class Palindrome {
    public static void main(String[] args) {
        Palin obj=new Palin();
        obj.accept();
        obj.check();

    }
}
