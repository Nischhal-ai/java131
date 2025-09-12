package Unit3;
import java.util.LinkedHashSet;
import java.util.Set;
public class prog8 {
    public static void main(String[] args) {
        Set<String> data=new LinkedHashSet<String>();
        data.add("set");
        data.add("first");
        data.add("second");
        data.add("first");
        data.add("set");
        System.out.println(data);
        data.clear();
        data.contains("set");
        data.isEmpty();



    }
}
