import java.util.*;
public class nestedtrycatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while(flag) {
            System.out.println("enter the index num:");
            int ind = sc.nextInt();
            try {
                System.out.println("welcome");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("sorry this index does not exist");
                    System.out.println("exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("thanks for using this program");
    }
}

