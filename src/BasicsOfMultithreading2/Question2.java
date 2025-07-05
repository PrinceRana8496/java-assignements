//Improve the code written in Basics of Multi Threading Part 1 exercise question 4 to handle the deadlock using reentract lock.
package BasicsOfMultithreading2;
import java.util.concurrent.locks.ReentrantLock;
class SharedResources {
    final ReentrantLock lock1 = new ReentrantLock();
    final ReentrantLock lock2 = new ReentrantLock();
}
public class Question2 {
    public static void main(String[] args) {
        SharedResources shared = new SharedResources();
        Thread t1 = new Thread(() -> {
            shared.lock1.lock();
            System.out.println("Thread 1 locked resource 1");
            try {
                Thread.sleep(1000);
                shared.lock2.lock();
                System.out.println("Thread 1 locked resource 2");
                shared.lock2.unlock();
            } catch (InterruptedException e) {
                System.out.println(e);;
            } finally {
                shared.lock1.unlock();
            }
        });

        Thread t2 = new Thread(() -> {
            shared.lock1.lock();  //Locking in same order as t1
            System.out.println("Thread 2 locked resource 1");

            try {
                Thread.sleep(1000);
                shared.lock2.lock();
                System.out.println("Thread 2 locked resource 2");
                shared.lock2.unlock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                shared.lock1.unlock();
            }
        });

        t1.start();
        t2.start();
    }
}
