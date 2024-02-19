package com.company;

public class MyThead extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(1000 * 15);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
