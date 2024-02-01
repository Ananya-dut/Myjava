import java.util.*;
public class linearsearch {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter the length:");
        int length=sc.nextInt();
        int [] arr=new int[length];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the searching value:");
        int v=sc.nextInt();
        int found=0;
        for(int i=0;i<length;i++){
            if(arr[i]==v){
                found=1;
                System.out.println("found successful");
            }
            else{
                System.out.println("found unsuccessful");
            }
        }
    }
    
}
