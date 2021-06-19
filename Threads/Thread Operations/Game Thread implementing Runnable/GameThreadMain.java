
class GameThread implements Runnable{
     
     private String gameName;

     GameThread(String gameName){
         this.gameName = gameName;
     }

     @Override
     public void run(){
         System.out.println(this.gameName + " is starting in ");
         try{
           for(int i=10;i >= 0;i--){
              System.out.println(i);
              Thread.sleep(30000);
           }
           System.out.println("\nPlay now!!");
         }catch(Exception ex){
             System.out.println("Game interrupted.. " + ex);
         }
     }
}

public class GameThreadMain{
    public static void main(String[] args){
        Thread game = new Thread(
                            new GameThread("League of Legends") 
                            );
        game.start();                    
    }
}