import java.util.*;
class Rearrange{
    String wrd;
    String newwrd;
    Rearrange(){
        System.out.println("this is a rearrange default constructor");
    }
    public void readWord(){
        Scanner sc=new Scanner(System.in);

            System.out.println("enter the word:");
            wrd = sc.next();

        
    }
    public void freq_vow_con(){
        wrd=wrd.toUpperCase();
        int v=0;
        int c=0;
        for(int i=0;i<wrd.length();i++){
            char ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
               v=v++;
               break;
            }
         else{
             c=c++;
             break;
            }
        }
        System.out.println("frequency of the vowel is:"+v);
        System.out.println("frequency of the consonant is:"+c);
    }
    public void arrange(){
        String v=new String();
        String c=new String();
        wrd=wrd.toUpperCase();
        for(int i=0;i<wrd.length();i++){
            char ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                v+=ch;
                break;
            }
            else{
                c+=ch;
                break;
            }
        }
        newwrd=v+c;
    }
    public void display(){
        System.out.println("the original word is:"+wrd);
        System.out.println("and the rearranged word is:"+newwrd);

    }
}
public class VowelConsonent {
    public static void main(String[] args) {
Rearrange obj=new Rearrange();
obj.readWord();
obj.freq_vow_con();
obj.arrange();
obj.display();
    }
}
