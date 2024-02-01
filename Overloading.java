public class Overloading {
//    static void tellJoke(){
//        System.out.println("I invented a new world!\n"+"Plagiarism");
//    }
//    static void change(int a){
//        a=98;
//
//    }
//    static void change2(int[] arr){
//        arr[0]=98;
//    }
    static void foo(){
        System.out.println("Good morning!");
    }
    static void foo(int a){
        System.out.println("good morning "+a+" bro!");
    }
    static void foo(int a,int b){
        System.out.println("good morning "+a+" bro!");
        System.out.println("good morning "+b+" bro!");
    }
    static void foo(int a,int b,int c){
        System.out.println("good morning "+a+" bro!");
        System.out.println("good morning "+b+" bro!");
        System.out.println("good morning "+c+" bro!");
    }

    public static void main(String[] args) {
//        tellJoke();
//        case-1: changing in integer
//        int x=45;
//        change(x);
//        System.out.println("the value of x after running change is: "+x);
//        case-2:changing in th array
//        int[] marks={52,73,77,89,98,94};
//        change2(marks);
//        System.out.println("the value of x after running change is:"+marks[0]);
//       Method overloading
        foo();
        foo(3000);
        foo(3000,4000);
        foo(3000,4000,5000);
    }
}
