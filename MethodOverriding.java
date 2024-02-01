class A{
    int a;
    //by default
    public int ananya(){
        return 4;
    }
    void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override
    void meth2(){
        System.out.println("I am method 2 of class B");
    }
    void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();
    }
}
