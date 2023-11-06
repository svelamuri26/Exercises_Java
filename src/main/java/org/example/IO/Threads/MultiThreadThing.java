package org.example.IO.Threads;


class CountThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);


        }
    }
}

public class MultiThreadThing {
    public static void main(String[] args) {
        CountThread myThing = new CountThread();

        myThing.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
