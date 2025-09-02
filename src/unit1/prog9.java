package unit1;

import java.util.*;
public class prog9 {
    public static void main(String[] args) {
        int x,y,z=0;
        Scanner sc=new Scanner(System.in);
        try
        {
            x=sc.nextInt();
            y=sc.nextInt();
            z=x/y;
            System.out.println("Exception not found");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Result is : "+z);
        }
    }
}
