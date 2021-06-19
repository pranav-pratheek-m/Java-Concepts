
class ThreadInterrupt extends Thread{
    public void run(){
        System.out.println("Hello.. ");
    }
}

public class ThreadInterruptMain{
    public static void main(String[] args){

       ThreadInterrupt thread1 = new ThreadInterrupt();
         thread1.start();
         thread1.interrupt();   
    }
}