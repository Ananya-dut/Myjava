class MyThr1 extends Thread{
    public MyThr1(String name){
       super(name);
    }
    public void run(){
        int i=34;
        while(i<4000){
            System.out.println("thank you "+this.getName());
            i++;
        }
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        MyThr1 t1=new MyThr1("Ananya");
        MyThr1 t2=new MyThr1("Ananya1");
        MyThr1 t3=new MyThr1("Ananya2");
        MyThr1 t4=new MyThr1("Ananya3");
        MyThr1 t5=new MyThr1("Ananya4 imp");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
