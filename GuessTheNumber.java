import java.util.*;
class Game{
    public int number;
    public int inputNumber;
    public int numberOfGuesses=0;
    public void setNumberOfGuesses(int numberOfGuesses){
        this.numberOfGuesses=numberOfGuesses;
    }
    public int getNumberOfGuesses(){
        return numberOfGuesses;
    }
     Game(){
        Random rand=new Random();
this.number= rand.nextInt(100);
    }
    public void takeUserInput(){
        System.out.println("guess the number:");
        Scanner sc=new Scanner(System.in);
inputNumber=sc.nextInt();

    }
    public boolean isCorrectNumber(){
        numberOfGuesses++;
if(inputNumber==number){
    System.out.println("yes you guessed it right,it was:"+number+"\nyou guessed it in "+numberOfGuesses+" attempts");
    return true;
}
else if (inputNumber<number) {
    System.out.println("too low...");
}
else if (inputNumber>number) {
    System.out.println("too high....");
}

    return false;

    }
}
public class GuessTheNumber {
    public static void main(String[] args) {

        //create a class Game,which allows a user to play "Guess the number" game once.game should have the following methods:-->
        //1.constructor to generate the random number
        //2.takeUserInput()to take a user input of number
        //3.isCorrectNumber()to detect whether the number entered by the user is true
        //use properties such as noOfGuesses(int),etc. to get this task done!





Game g=new Game();
boolean b=false;
while(!b) {
    g.takeUserInput();
    b = g.isCorrectNumber();
}
    }
}
