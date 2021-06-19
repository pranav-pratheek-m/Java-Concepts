class LoopThreadNormalInterrupt extends Thread{
    public void run(){
        System.out.println("\nIn LoopThreadNormalInterrupt loop");
            for(int i=0;i<100;i++){
                System.out.println("Value is " + i);
                if(this.isInterrupted()){
                System.out.println("Interrupt() was called on LoopThreadNormalInterrupt \n");
                break;
              }
            }                   
    }
}

public class LoopThreadNormalInterruptMain{
  public static void main(String[] args){
    LoopThreadNormalInterrupt thread = new LoopThreadNormalInterrupt();
         thread.start();
         thread.interrupt();
  }
}

