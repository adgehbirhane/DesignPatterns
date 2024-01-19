

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Without synchronization
        Thread t1 = new WorkerWithoutSynchronization(counter);
        Thread t2 = new WorkerWithoutSynchronization(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Without Synchronization: " + counter.getCount());

        // Reset counter for the next test
        counter = new Counter();

        // With synchronization
        Thread t3 = new WorkerWithSynchronization(counter);
        Thread t4 = new WorkerWithSynchronization(counter);

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("With Synchronization: " + counter.getCount());
    }
}
