package Unit3;

import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sr = sc.next();
        String str = sc.next();
        System.out.println(sr.substring(2, 4));
        System.out.println(sr.length());
        System.out.println(sr.toUpperCase());
        if(sr.compareTo(str)>0)
        {
            System.out.println("hie");
        }
        else
            System.out.println("jh");

    }
}
