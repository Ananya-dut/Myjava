import java.util.*;
public class muloftwomatrix {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("enter the row size:");
        int row=sc.nextInt();
        System.out.print("enter the column size:");
        int column=sc.nextInt();
        int[][] m1=new int[row][column];
        
        int[][]m=new int[row][column];
        
        System.out.println("the matrix is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                m1[i][j]=sc.nextInt();
            }
        }
    
        
        System.out.println("the transpose matrix is:");
        for(int j=0;j<column;j++){
            for(int i=0;i<row;i++){
            System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("the mul of 2 matrix is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                 m[i][j]=m1[i][j]*m1[i][j];
                 System.out.print(m[i][j]+" ");
                
            }
            System.out.println();
        }
    
}

    
}
