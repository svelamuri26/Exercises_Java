package IO.Threads;

class RunnerTask implements Runnable {
    private String runnerName;

    public RunnerTask(String name) {
        this.runnerName = name;
    }

    @Override
    public void run() {
        for (int distance = 1; distance <= 10; distance++) {
            System.out.println(runnerName + " is running... Distance: " + distance);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(runnerName + " has finished the race!");
    }
}

public class RaceSimulation {
    public static void main(String[] args) {
        int numRunners = 5;

        for (int i = 1; i <= numRunners; i++) {
            Runnable runner = new RunnerTask("Runner " + i);
            Thread thread = new Thread(runner);
            thread.start();
        }
    }
}