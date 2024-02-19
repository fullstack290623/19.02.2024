package com.company;

import java.util.Random;

public class MainPrize {

    // random number 1-100
    // run thread- 1:
    //   each 50 mili guess number 1-100
    //   if the number is correct then he wins the price (bonus: interrupts the 2nd thief)
    // run thread- 2:
    //   each 50 mili guess number 1-100
    //   if the number is correct then he wins the price (bonus: interrupts the 1nd thief)
    static boolean found = false;

    public static void main(String[] args) {

        Random r = new Random();
        int safe = r.nextInt(100) + 1;

        for(int i = 1; i <= 2; i++) {
            new Thread(() -> {
                while (!found) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int guess = r.nextInt(100) + 1;
                    System.out.println("Thief " + Thread.currentThread().getName() + " guessed " + guess + ". prize = " + safe);
                    if (guess == safe) {
                        System.out.println("Thief " + Thread.currentThread().getName() + " founded!!");
                        found = true;
                    }
                }
            }).start();
        }

    }

}
