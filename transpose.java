import java.util.*;
public class transpose {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("enter the row size:");
        int row=sc.nextInt();
        System.out.print("enter the column size:");
        int column=sc.nextInt();
        int[][]matrix=new int[row][column];
        System.out.println("the matrix is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        System.out.println("the transpose matrix is:");
        for(int j=0;j<column;j++){
            for(int i=0;i<row;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
