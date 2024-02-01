  class Employee1{
      int id;
      String name;
     int salary;
      public void getDetails(){
         System.out.println("my id is:"+id);
         System.out.println("my name is:"+name);
     }
      public  int getSalary(){
         return salary;
     }
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
      Employee1 obj=new Employee1(); //Instantiating a new Employee object
      Employee1 obj2=new Employee1(); //Instantiating a new Employee object2
        //setting attributes for obj
        obj.id=12;
        obj.name="Ananya";
        obj.salary=10;

        //setting attributes for obj2
        obj2.id=17;
        obj2.name="Shreyasi";
        obj2.salary=10;

        //printing the attributes
        obj.getDetails();
        int salary=obj.getSalary();
        System.out.println("the salary of Ananya is:"+salary);
        obj2.getDetails();
        int salary2=obj2.getSalary();
        System.out.println("the salary of Shreyasi is:"+salary2);

    }
}
