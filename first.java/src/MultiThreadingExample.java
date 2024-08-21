public class MultiThreadingExample {
    public static void main(String[] args) {
        Thread redThread = new Thread(new MyRunnable("Red"));
        Thread blueThread = new Thread(new MyRunnable("Blue"));
        Thread greenThread = new Thread(new MyRunnable("Green"));

        redThread.start();
        blueThread.start();
        greenThread.start();
    }
}

class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadName + " is running.");
    }
}
