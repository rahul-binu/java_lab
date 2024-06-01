class PrintNumbers {
    private static final Object lock = new Object();
    private static int count = 1;
    private static final int MAX_COUNT = 10;

    static class OddThread extends Thread {
        @Override
        public void run() {
            while (count <= MAX_COUNT) {
                synchronized (lock) {
                    if (count % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() + ": " + count);
                        count++;
                    }
                }
                try {
                    Thread.sleep(500); // Delay for better visibility
                } catch (InterruptedException e) {
                    // Ignore InterruptedException
                }
            }
        }
    }

    static class EvenThread extends Thread {
        @Override
        public void run() {
            while (count <= MAX_COUNT) {
                synchronized (lock) {
                    if (count % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + count);
                        count++;
                    }
                }
                try {
                    Thread.sleep(500); // Delay for better visibility
                } catch (InterruptedException e) {
                    // Ignore InterruptedException
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread oddThread = new OddThread();
        Thread evenThread = new EvenThread();

        oddThread.setName("Odd Thread");
        evenThread.setName("Even Thread");

        oddThread.start();
        evenThread.start();
    }
}
