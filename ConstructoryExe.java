//Quick Quiz:
class Constructortry
{
    private String name;
    private int sal;

    Constructortry()
    {
        name="DEFAULT";
        sal=10000;
    }
    Constructortry(int s)
    {
        name="Overload";
        sal=s;
    }
    public int getSal()
    {
        return sal;
    }
    public String getName(){
        return name;
    }
}

class ConstructortryExe
{
    public static void main(String[] args)
    {
        Constructortry ob=new Constructortry();
        Constructortry ob2=new Constructortry(70000);
        System.out.println(ob.getName());
        System.out.println(ob.getSal());
        System.out.println(ob2.getName());
        System.out.println(ob2.getSal());
    }
}
