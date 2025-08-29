import java.util.*;
public class main11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount  ");
        int amount=sc.nextInt();
        prog11_2 m1=new prog11_2();
        try {
            m1.withdrawal(amount);
        }
        catch(prog11 e)
        {
            System.out.println(e.getMessage());
        }
    }
}
