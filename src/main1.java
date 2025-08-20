public class main1
{
    public static void main(String[] args)
    {
        prog1 s1 = new prog1(58,"Nischhal");
        prog1 s2=new prog1(23,"ity");
        prog1 s3=new prog1(s1);
        s1.display();
        s2.display();
        s3.display();
        s1.name="hie";
        s1.roll_no=57;
        s3.display();
        s1.display();

    }
}