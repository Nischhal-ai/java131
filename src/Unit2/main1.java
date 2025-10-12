package Unit2;
import java.util.*;
public class main1 {
    public static void main(String[] args) {
        prog1 th1=new prog1();
        th1.start();
//        System.out.println(th1.getName());
//       th1.setName("FIRST THREAD");
//        System.out.println(th1.getName());
//        System.out.println(th1.getPriority());
//        th1.setPriority(9);
//        System.out.println(th1.getPriority());

        prog1_1 th2=new prog1_1();
        th2.start();
    }
}
