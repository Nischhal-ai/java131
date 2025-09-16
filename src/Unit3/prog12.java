package Unit3;

import java.util.*;

public class prog12 {
    public static void main(String[] args) {
        HashMap<String,Integer> hs=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String key=sc.next();
            int value=sc.nextInt();
            hs.put(key,value);
        }
        for(String k: hs.keySet())
        {
            System.out.println(k+" "+hs.get(k));
        }
    }
}
