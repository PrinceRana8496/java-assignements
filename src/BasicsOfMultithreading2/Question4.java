package BasicsOfMultithreading2;
import java.util.Random;
import java.util.concurrent.*;

public class Question4 {
    public static void main(String[] args) throws Exception {
        Callable<Integer> task = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return new Random().nextInt(70);
            }
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(task);

        System.out.println("Random number: " + future.get());

        executor.shutdown();
    }
}
