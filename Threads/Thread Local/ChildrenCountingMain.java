class ChildrenCounting implements Runnable {

    ThreadLocal<Integer> counter = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + "'s turn to count from 1 to 10.\n");

            for (int i = 1; i <= 10; i++) {

                int value = (this.counter.get()).intValue();
                this.counter.set(++value);

                System.out.println("Counted: " + this.counter.get());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    System.out.println("Thread interrupted..");
                }
            }

            System.out.println("\nWell done, " + Thread.currentThread().getName() + "!!\n");
        }
    }
}

public class ChildrenCountingMain {
    public static void main(String[] args) {
        ChildrenCounting cc = new ChildrenCounting();

        Thread rajesh = new Thread(cc, "Rajesh");
        Thread suresh = new Thread(cc, "Suresh");

        rajesh.start();

        // try {
        // rajesh.join();
        // } catch (InterruptedException ie) {
        // }
        suresh.start();
    }
}