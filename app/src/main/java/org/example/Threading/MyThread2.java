package org.example.Threading;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i< 10; i++) {
            System.out.println("Thread 2 is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
