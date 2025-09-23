package Unit2;

public class prog1_1 extends Thread{
    public void start()
    {
        for(int i=2;i<20;i=i+2){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }
}
