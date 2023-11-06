package IO.Threads;

public class MultiThreading {


        public static void main(String[] args) {
            Thread evenThread = new Thread(new EvenThread());
            Thread oddThread = new Thread(new OddThread());

            evenThread.start();
            oddThread.start();
        }


}
