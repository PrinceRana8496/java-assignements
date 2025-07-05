//Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool()
// to submit a list of tasks and wait for completion of all tasks.
package BasicsOfMultithreading2;
import java.util.concurrent.*;

public class Question3 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " is executing");

        // Single thread executor
        ExecutorService singleThread = Executors.newSingleThreadExecutor();

        // Fixed thread pool
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);

        // Cached thread pool
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        for (int i = 0; i < 6; i++) {
            singleThread.submit(task);
            fixedThreadPool.submit(task);
            cachedThreadPool.submit(task);
        }

        singleThread.shutdown();
        fixedThreadPool.shutdown();
        cachedThreadPool.shutdown();

        singleThread.awaitTermination(1, TimeUnit.MINUTES);
        fixedThreadPool.awaitTermination(1, TimeUnit.MINUTES);
        cachedThreadPool.awaitTermination(1, TimeUnit.MINUTES);
    }
}

