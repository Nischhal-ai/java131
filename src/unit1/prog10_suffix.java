package unit1;

public class prog10_suffix {
    public void validate(int age) throws prog10
    {
        if(age<18)
            throw new prog10("Can not vote underage....");
        else
            System.out.println("U are 18 plus can vote......");
    }
}
