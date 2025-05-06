package MultiThreading;

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}

class MyThread extends Thread{
    private Counter counter;

    MyThread(Counter c){
        this.counter = c;
    }

    Counter getCounter(){
        return this.counter;
    }

    @Override
    public void run() {
        for(int i =0; i < 1000; i++){
            this.counter.incrementCount();
        }
    }
}

class Counter{
    private int count= 0;

    public int getCount(){
        return this.count;
    }

    public synchronized void incrementCount(){
        this.count++;
    }
}