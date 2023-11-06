package org.example.IO.Threads;


class SumofArray implements Runnable {
    private int[] numbers;

    public SumofArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of the array: " + sum);
    }
}

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        SumofArray sumTask = new SumofArray(numbers);

        Thread thread = new Thread(sumTask);
        thread.start();
    }
}
