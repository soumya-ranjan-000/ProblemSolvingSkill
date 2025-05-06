package MultiThreading;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread st1 = new Student();

        System.out.println(st1.getName()+" is "+st1.getState());
        st1.start();
        Thread.sleep(2000L);
        System.out.println(st1.getName()+" is "+st1.getState());
//        st1.join();
        System.out.println(st1.getName()+" is "+st1.getState());
        System.out.println("Hello World");
    }
}

//class Student extends ArrayList<String> implements Runnable{
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName()+" is RUNNING.");
//        try {
//            Thread.sleep(3000L);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

class Student extends  Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is RUNNING.");
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}