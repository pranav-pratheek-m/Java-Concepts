class Queue{

int num;
boolean isQueueFull = false;

public synchronized void put(int num){

    while(this.isQueueFull){
        try{
            wait();
        }catch(Exception e){}
    }

    System.out.println("Sent -> " + num);
    this.num = num;
    this.isQueueFull = true;
    notify();
}

public synchronized void get(){

     while(!this.isQueueFull(){
         try{
             wait();
         }catch(Exception e){};
     }

    System.out.println("Recieved -> " + num);
    this.isQueueFull = false;
    notify();
   }
}

class Producer implements Runnable{
    Queue queue;

    Producer(Queue queue){
        this.queue = queue;
        Thread producerThread = new Thread(this,"producer");
        producerThread.start();
    }

    public void run(){
        int i=0;

        while(true){
            queue.put(i++);

            try{
              Thread.sleep(1000);
            }catch(InterruptedException ie){}
        }
    }
}

class Consumer implements Runnable{
    Queue queue;

    Consumer(Queue queue){
        this.queue = queue;
        Thread consumerThread = new Thread(this,"consumer");
        consumerThread.start();
    }

    public void run(){
        int i=0;

        while(true){
            queue.get();

            try{
              Thread.sleep(1000);
            }catch(InterruptedException ie){}
        }
    }
}


public class ProducerConsumerProblem{
    public static void main(String[] args){
        Queue queue = new Queue();
        new Producer(queue);
        new Consumer(queue);

    }
}