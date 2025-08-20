public class prog1
{
    int roll_no;
    String name;
    prog1()
    {
        System.out.println("Default constructor");
    }
    prog1(int r,String n)
    {
        roll_no=r;
        name=n;
    }
    prog1(prog1 s)
    {
        roll_no=s.roll_no;
        name=s.name;
    }
    public void display()
    {
        System.out.println("Roll no "+roll_no);
        System.out.println("Name "+name);

    }
}
