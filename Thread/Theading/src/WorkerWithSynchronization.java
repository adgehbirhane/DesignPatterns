class WorkerWithSynchronization extends Thread {
    private Counter counter;

    public WorkerWithSynchronization(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.incrementWithSynchronization();
    }
}