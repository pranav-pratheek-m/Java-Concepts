
class MoneyWithdrawal implements Runnable {

    ThreadLocal<Integer> capital = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 1_00_000;
        }
    };

    @Override
    public void run() {
        synchronized (this) {
            int i = 1;
            System.out.println(
                    "\n" + Thread.currentThread().getName() + "'s transactions (starting with $" + capital.get() + ")");

            while (capital.get().intValue() >= (5000 * i)) {
                int amount = capital.get().intValue() - (5000 * i);
                capital.set(amount);
                System.out.println("Current balance: $" + capital.get() + " Withdrawn: " + (5000 * i));
                i++;

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    System.out.println("Thread Sleep interrupted!!" + ie);
                }
            }
            System.out.println("\nInsufficient balance!!only $" + capital.get() + "left.. \n");
        }
    }
}

public class MoneyWithdrawalMain {
    public static void main(String[] args) {
        MoneyWithdrawal mw = new MoneyWithdrawal();

        Thread john = new Thread(mw, "John");
        Thread joseph = new Thread(mw, "Joseph");
        Thread edward = new Thread(mw, "Edward");

        john.start();

        // try {
        // john.join();
        // } catch (InterruptedException ie) {
        // System.out.println("Thread join interrupted!!" + ie);
        // }

        joseph.start();

        // try {
        // joseph.join();
        // } catch (InterruptedException ie) {
        // System.out.println("Thread join interrupted!!" + ie);
        // }

        edward.start();

        // try {
        // edward.join();
        // } catch (InterruptedException ie) {
        // System.out.println("Thread join interrupted!!" + ie);
        // }

    }
}