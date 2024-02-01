class fibonacci{
    int n;
    fibonacci(int num){
        this.n=num;
    }
    public void Fibo()
    {
        int num1 = 0, num2 = 1;

        int counter = 0;


        while (counter < n) {


            System.out.print(num1 + " ");

            
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}
public class fibonacciusingconstructor {
    public static void main(String[] args) {
fibonacci f=new fibonacci(10);
f.Fibo();
    }
}
