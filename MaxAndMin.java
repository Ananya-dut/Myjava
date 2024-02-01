import java.util.*;
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int length=sc.nextInt();
        int[] arr=new int[length];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(max+"is a maximum number");
        System.out.println(min+"is a minimum number");


    }
}
