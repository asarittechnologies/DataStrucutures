package javabrainsCoreJava;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchrnizationTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        new Thread(counter,"one").start();
        new Thread(counter,"two").start();
        new Thread(counter,"three").start();
        new Thread(counter,"four").start();
    }
}

class Counter implements Runnable{
    private Lock l = new ReentrantLock();
    private int value=0;
    private Integer i =10;
    public void increament(){
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        value++;
    }
    public void decreament(){
        value--;
    }
    public int getValue(){
        return value;
    }

    @Override
    public void run() {
        //synchronized (i){ instead of using synchronized use Lock interface methods
            l.lock();
            try{
                this.increament();
                System.out.println(Thread.currentThread().getName()+" increatement "+this.getValue());
                this.decreament();
                System.out.println(Thread.currentThread().getName()+" decreament "+this.getValue());
            }finally {
                l.unlock();
            }
            // unlocking in synchronization will be done by JVM if any exception happens in middle
        // in this case as we are creating lock we shold release the lock so we keep all code in try and unlock in finally

        // and release the lock}



    }
}