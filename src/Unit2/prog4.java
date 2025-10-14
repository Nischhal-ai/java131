package Unit2;

public class prog4
{
    public static void saySomething()
    {
        System.out.println("HELLOOO hellooo how are uuuu");
    }
    public static void main(String[] args)
    {
        Sayable sayable=prog4::saySomething;
        sayable.say();
    }
}