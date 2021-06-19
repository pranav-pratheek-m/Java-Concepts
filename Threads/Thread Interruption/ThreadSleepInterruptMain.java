class ThreadSleepInterrupt extends Thread{
    public void run(){
        try{
         System.out.println("Hello.. ");
         Thread.sleep(10000);
        }catch(InterruptedException ie){
            System.out.println(" ThreadSleepInterrupt Thread interrupted!! --> " + ie + "\n");
        }
    }
}

public class ThreadSleepInterruptMain{
    public static void main(String[] args){
       ThreadSleepInterrupt thread = new ThreadSleepInterrupt();
           thread.start();
           thread.interrupt();
    }
}
