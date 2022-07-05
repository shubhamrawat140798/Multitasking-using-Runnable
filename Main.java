// Create and Run a Thread using Runnable Interface and Thread class.
class Normal extends Thread{
    public void run()
    {
        System.out.println("Thread is Running... thread extend method");
    }
}
class Run implements Runnable{
    public void run()
    {
        System.out.println("Thread is running.. by Runnable Interface method");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Normal t1= new Normal();
        t1.start();
        Run r= new Run();
        Thread t2= new Thread(r);
        t2.start();
    }
}
