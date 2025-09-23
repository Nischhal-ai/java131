package Unit2;
import java.util.*;
public class prog1 extends Thread{
    public void start()
    {
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }
}
