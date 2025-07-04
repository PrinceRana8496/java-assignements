//Use Synchronize method and synchronize block to enable synchronization between multiple threads trying to access method at same time.
package BasicsofMultithreading1;
class Printer {
    public synchronized  void printSyncMethod(String msg) {
        System.out.println(Thread.currentThread().getName() + ": " + msg);
    }
    public  void printSyncBlock(String msg) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + ": " + msg);
        }
    }
}
public class Question2 {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++) {
                    printer.printSyncBlock("Static Method");
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++) {
                    printer.printSyncBlock("Static Block");
                }
            }
        });
        t1.start();
        t2.start();

    }
}

