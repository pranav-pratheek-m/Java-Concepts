class LoopThreadSleepInterrupt extends Thread {
    public void run() {
        // System.out.println("\nIn LoopThreadSleepInterrupt loop");
        // try {
        for (int i = 0; i < 5000; i++) {
            System.out.println("Value is " + i);
            if (this.isInterrupted()) {
                break;
            }
            // Thread.sleep(1);
        }
        // } catch (InterruptedException ie) {
        // System.out.println(" LoopThreadSleepInterrupt Thread interrupted!! --> " + ie
        // + "\n");
        // }
    }
}

public class LoopThreadSleepInterruptMain {
    public static void main(String[] args) {
        LoopThreadSleepInterrupt thread = new LoopThreadSleepInterrupt();
        thread.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException ie) {
            System.out.println(" Main Thread interrupted!! --> " + ie + "\n");
        }
        thread.interrupt();

    }
}
