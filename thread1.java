class thrd1 extends Thread{
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("my cooking thrd1 is running");
            System.out.println("I am happy!");
            i++;
        }
    }
}
class thrd2 extends Thread{
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("thrd2 for chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}
public class thread1 {
    public static void main(String[] args) {
thrd1 t1=new thrd1();
thrd2 t2=new thrd2();
t1.start();
t2.start();
    }
}
