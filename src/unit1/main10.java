package unit1;

public class main10 {
    public static void main(String[] args) {

        prog10_suffix e1 = new prog10_suffix();
        try {
            e1.validate(18);
        }
        catch(prog10 e)
        {
            System.out.println(e.getMessage());
        }
    }
}
