import java.util.*;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 0 for rock,1 for paper and 2 for scissor:");
        int userinput=sc.nextInt();
//        allocate random number for taking input from0 computer
        Random rand=new Random();
//        take input from computer
       int computerinput=rand.nextInt(3);
       if(userinput==computerinput){
           System.out.println("match draw");
       } else if (userinput==0 && computerinput==2 || userinput==1 && computerinput==0 || userinput==2 && computerinput==1) {
           System.out.println("you win,congrats!");

       }
       else{
           System.out.println("computer win!");
       }
    if(computerinput==0){
        System.out.println("computer choice:rock");
    }
    else if (computerinput==1) {
        System.out.println("computer choice:paper");

    }
    else if (computerinput==2) {
        System.out.println("computer choice:scissor");
    }
    }
}