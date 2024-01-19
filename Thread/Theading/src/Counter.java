class Counter {
    private int count = 0;

    // Without synchronization
    public void incrementWithoutSynchronization() {
        for (int i = 0; i < 100000; i++) {
            count++;
        }
    }

    // With synchronization
    public synchronized void incrementWithSynchronization() {
        for (int i = 0; i < 100000; i++) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
