package Unit3;
import java.util.*;
public class prog9
{
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        HashSet<String> hs2=new HashSet<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of elements in hs");
        int n=sc.nextInt();
        System.out.println("enter no of elements in hs2");
        int m=sc.nextInt();
        System.out.println("Enter elements in hs");

        for(int i=0;i<n;i++)
        {
          hs.add(sc.next());
        }
        System.out.println("Enter elements in hs2");
        for(int i=0;i<m;i++)
        {
            hs2.add(sc.next());
        }
        System.out.println("Elements of hs");
        System.out.println(hs);
        System.out.println("Elements of hs2");
        System.out.println(hs2);
        System.out.println("Adding union");
       System.out.println(hs.addAll(hs2));
        System.out.println(hs);
        hs.removeAll(hs2);
        System.out.println(hs);
        hs.removeIf(str->str.contains("90"));
        System.out.println(hs);


    }
}
