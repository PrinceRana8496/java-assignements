package BasicsOfMultithreading2;
import java.util.concurrent.*;
public class Question5 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable longTask = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " started");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " finished");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }
        };
        executor.submit(longTask);
        executor.submit(longTask);
        //wait for runnig task to finish
        //executor.shutdown();
        //not wait for running task
        executor.shutdownNow();

        System.out.println("Task finished");
    }
}

