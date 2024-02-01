class Mythr implements Runnable{
    public Mythr(String name){
//        System.out.println("this is a default constructor of name");

    }
    public void run(){
        System.out.println("thank you!");
    }
}

public class ConstructorFromThreadClass {
    public static void main(String[] args) {
        Mythr t1=new Mythr("Ananya");
        Thread t=new Thread(t1,"Ananya");
        Mythr t2=new Mythr("Rakhi");
        Thread ti=new Thread(t2,"Rakhi");
        t.start();
        ti.start();
        System.out.println("the id of the t1 thread:"+t.getId());
        System.out.println("the name of the t1 thread:"+t.getName());
        System.out.println("the id of t2 thread:"+ti.getId());
        System.out.println("the name of t2 thread:"+ti.getName());
    }
}
