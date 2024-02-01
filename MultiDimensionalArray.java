public class MultiDimensionalArray {
    public static void main(String[] args) {
//        1-D array declaration
//        int[] marks;
//        2-D array declaration
        int[][] marks;
        marks = new int[2][3];
        marks[0][0] = 101;
        marks[0][1] = 102;
        marks[0][2] = 103;
        marks[1][0] = 201;
        marks[1][1] = 202;
        marks[1][2] = 203;
//        System.out.println(marks[0][2]);
        System.out.println(marks[1].length);


//        displaying the 2-D array (for loop)
        System.out.println("printing a 2-D array using for loop");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
