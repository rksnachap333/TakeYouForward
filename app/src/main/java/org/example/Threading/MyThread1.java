package org.example.Threading;

public class MyThread1 extends Thread{

    @Override
    public void run() {
        super.run();

        for(int i= 0;i < 10;i ++) {
            System.out.println("Thread 1 is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
