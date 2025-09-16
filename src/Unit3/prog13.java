package Unit3;
import java.io.*;
import java.util.*;

public class prog13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> hs = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            String c = sc.next();
            String value = sc.next();

            if (c.equals("add"))
            {
                int count;
                if (hs.containsKey(value))
                {
                    count = hs.get(value);
                }
                else
                {
                    count = 0;
                }
                hs.put(value, count + 1);
            }
            else if (c.equals("count"))
            {
                int count = 0;
                if (hs.containsKey(value))
                {
                    count = hs.get(value);
                }
                System.out.println(count);
            }
            else if (c.equals("remove"))
            {
                if (hs.containsKey(value))
                {
                    int Count = hs.get(value);
                    if (Count > 1)
                    {
                        hs.put(value, Count - 1);
                    }
                    else
                    {
                        hs.remove(value);
                    }
                }
            }
        }
    }
}