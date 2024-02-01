import java.util.*;
public class ascendingsorting {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("enter the length:");
        int length=sc.nextInt();
        int [] arr=new int[length];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[j]<arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
            System.out.println("\n");
        }
    }
    
}
