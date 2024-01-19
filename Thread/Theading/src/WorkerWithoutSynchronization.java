class WorkerWithoutSynchronization extends Thread {
    private Counter counter;

    public WorkerWithoutSynchronization(Counter counter) {
        this.counter = counter;
    }

    @Override	
    public void run() {
        counter.incrementWithoutSynchronization();
    }
}