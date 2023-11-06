package org.example.IO.Threads;
//Create two threads where one thread prints even numbers
// and the other prints odd numbers from 1 to 20.

class EvenThread implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}