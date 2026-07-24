// Thread 1
class MultiThread extends Thread {

    @Override
    public void run() {

        // Loop runs 5 times
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 is running...");
        }
    }
}

// Thread 2
class MultiThread2 extends Thread {

    @Override
    public void run() {

        // Loop runs 5 times
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2 is running...");
        }
    }
}

// Main Class
public class ThreadCreationDemo {

    public static void main(String[] args) {

        // Creating thread objects
        MultiThread thread1 = new MultiThread();
        MultiThread2 thread2 = new MultiThread2();

        // Starting both threads
        thread1.start();
        thread2.start();
    }
}
