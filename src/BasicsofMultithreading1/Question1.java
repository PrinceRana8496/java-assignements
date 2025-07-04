//Create and Run a Thread using Runnable Interface and Thread class and
// show usage of sleep and join methods in the created threads.
package BasicsofMultithreading1;
class Process extends Thread {
    @Override
    public  void run ()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread thread Started");
    }
}
class Process1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable thread started");
    }
}
public class Question1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new Process1());
        Process p=new Process();
        p.start();
        t.start();
        p.join();
        t.join();
        System.out.println("Main thread execution completed");
    }
}
