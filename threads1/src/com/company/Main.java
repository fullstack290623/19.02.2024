package com.company;

public class Main {


    public class OutOfPitaException extends Exception {

    }

    public static void sleep_time() throws InterruptedException {
        throw new InterruptedException();
    }

    public static void main(String[] args) throws InterruptedException {
	// write your code here


        //sleep_time();

        //System.out.println(Thread.currentThread().getName());

        new Thread(() -> {
            //System.out.println(Thread.currentThread().getName());
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }).start();
//
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        Thread t1 = new Thread(() -> {
//            //System.out.println(Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000 * 15);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(Thread.currentThread().getName() + ": " + i);
//            }
//        });
//        t1.start();


        MyThead t1 = new MyThead();
        //t1.run(); // wrong -- will not invoke a new Thread! (will run on main)
        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.interrupt();

        //System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }

    }
}
