
class GameThread extends Thread{
    private String threadName;

    GameThread(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run(){
        System.out.println( this.threadName + " game is starting in : ");

        try{
          for(int i=10;i>0;i--){
              System.out.println(i);
              Thread.sleep(500);
             }
        }catch(Exception ex){
            System.out.println("Game interrupted!! " +ex);
        }

        System.out.println("\nPlay now!!");
    }
}

public class GameThreadMain{
    public static void main(String[] args){
        GameThread game = new GameThread("Call of Duty");
        game.start();
    }
}