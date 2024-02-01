import java.util.*;
public class arrsorted {
    public static void printArray(int number[]){
        int n = number.length;
        for(int i=0;i<n;i++){
            System.out.println("list"+i+number[i]);

        }
    }
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter size:");
        int size=sc.nextInt();
        boolean flag = false;
        int[] number=new int[size];
        for(int i=0;i<size;i++){
            
            number[i]=sc.nextInt();
        }
        for(int i=1;i<size;i++){
            if(number[i-1]<number[i]){
                flag = true;
            }
            else{
                flag=false;
            }
        }
        if(flag==true){
            printArray(number);
        }
    }
    
}
