package org.example.JavaConcept.Threading.Volatile;

public class Main {

    static class SharedResource {
        volatile boolean flag = false; // Marked as volatile
    }

    public static void main(String[] args) throws InterruptedException{
        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(()->{
            System.out.println("Worker 1 started....");
            while (!resource.flag) {
                // Busy wait, but will see changes immediately
//                System.out.println("Worker 1 is still running...");
            }
            System.out.println("Worker 1 finished");
        });

        Thread thread2 = new Thread(()->{
            System.out.println("Worker 2 started...............................");
            try {
                System.out.println("Worker 2 is going to sleep for 10 sec");
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("Worker 2 is awake now it will turn flag on");
            resource.flag = true;
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
