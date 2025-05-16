package interviewQuestions.threads;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
        try {
            Thread.sleep(2000); // Simulates timed waiting state
            System.out.println("Thread woke up after sleeping...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is completing...");
    }
}

public class ThreadLifeCycle {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        System.out.println("State after creation: " + t.getState()); // NEW
        t.start();
        System.out.println("State after start(): " + t.getState());  // RUNNABLE

        try {
            Thread.sleep(500); // Let the thread enter sleep
            System.out.println("State during sleep: " + t.getState()); // TIMED_WAITING

            t.join(); // Wait for thread to die
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State after thread finishes: " + t.getState()); // TERMINATED
    }
}

