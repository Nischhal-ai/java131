package Unit3;

import java.util.*;

public class prog4 {
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<>();
        System.out.println("Enter the number of products");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println();
        for(int i=0;i<n;i++)
        {
            product.add(sc.next());
        }
        Collections.sort(product);

        Iterator it=product.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        product.add(1,"Apple");
        product.addLast("Pear");
        product.addFirst("Orange");
        System.out.println(product);
        System.out.println("which index do u want to know");
        System.out.println(product.get(sc.nextInt()));
    }
}
