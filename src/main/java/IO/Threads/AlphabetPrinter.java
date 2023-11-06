package IO.Threads;

class AlphabetRunnable implements Runnable {
    @Override
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}
public class AlphabetPrinter {
    public static void main(String[] args) {
        Runnable alphabetRunnable = new AlphabetRunnable();
        Thread thread = new Thread(alphabetRunnable);
        thread.start();
    }
}