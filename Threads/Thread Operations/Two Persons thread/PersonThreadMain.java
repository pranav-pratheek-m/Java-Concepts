class PersonThread implements Runnable{

    private String personId;
    private int interval;

    PersonThread(String personId,int interval){
        this.personId = personId;
        this.interval = interval;
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("I am " + this.personId);
            try{
                Thread.sleep(this.interval);
            }catch(InterruptedException ie){
                System.out.println("Person interrupted!");
            }
        }
        System.out.println("\n" + this.personId +" left");
    }
}

public class PersonThreadMain{
    public static void main(String[] args){
        Thread person1 = new Thread(
                           new PersonThread("Person 1",500)
                           );

        Thread person2 = new Thread(
                           new PersonThread("Person 2",500)
                           );
        person1.start();
        person2.start();                          
    }
}