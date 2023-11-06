package org.example.IO.Threads;

class Cooking implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Cooking Pasta ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Eating implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Eating Pasta");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class KitchenThread {


    public static void main(String[] args) {
        Thread cookingThread = new Thread(new Cooking());
        Thread eatingThread = new Thread(new Eating());

        cookingThread.start();
        eatingThread.start();
    }


}
