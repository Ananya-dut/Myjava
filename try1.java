public class try1 {
    public static void main(String[] args) {
        //without using try catch
        int a=6000;
        int b=4;
        //with try
        try{
            int c=a/b;
            System.out.println("the result is:"+c);
        }
        catch(Exception e){
            System.out.println("we failed to divide. reason:"+e);
        }
//        int c=a/b;
//        System.out.println("the result is:"+c);
        System.out.println("end of the program");
    }
}
