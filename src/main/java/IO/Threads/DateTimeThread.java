package IO.Threads;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


class ClockThread extends Thread {
    @Override
    public void run() {
        while (true) {
            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = currentTime.format(formatter);
            System.out.println("Current time: " + formattedTime);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class DateTimeThread {
    public static void main(String[] args) {
        ClockThread clockThread = new ClockThread();
        clockThread.start();
    }
}
