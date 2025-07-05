//WAP to show usage of Callable and demonstrate how it is different from Runnable
package BasicsOfMultithreading2;
import java.util.concurrent.*;
public class Question1 {
    public static void main(String[] args) throws Exception {
        //not return value
        Runnable runnableTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable executed");
            }
        };
        //return value
        Callable<String> callableTask = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Callable Executed";
            }
        };
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(runnableTask);
        Future<String> future = executor.submit(callableTask);
        System.out.println("Callable result:" + future.get());
        executor.shutdown();
    }
}

