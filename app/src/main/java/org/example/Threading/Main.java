package org.example.Threading;

public class Main {

    public static void main(String[] args) {
        System.out.println("------Threading concepts----------");
        MyThread1 obj1 = new MyThread1();
        Runnable obj2 = new MyThread2();
        Thread t2 = new Thread(obj2);
        obj1.start();
        t2.start();
    }
}
