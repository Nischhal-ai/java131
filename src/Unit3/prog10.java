package Unit3;

import java.util.LinkedHashSet;

public class prog10 {
    public static void main(String[] args) {
        LinkedHashSet<String> ls=new LinkedHashSet<>(10);
        ls.add("one");
        ls.add("Two");
        ls.add("Two");
        ls.add("six");
        ls.add("four");
        System.out.println(ls);

    }
}
