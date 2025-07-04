//WAP to showcase the usage of volatile in java.
package BasicsofMultithreading1;
class SharedResource {
      volatile boolean flag = true;
}
public class Question3{
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> {
            while (resource.flag) {
                System.out.println("Running");
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.flag = false;
            System.out.println("Flag set  false");
        });

        t1.start();
        t2.start();
    }
}
