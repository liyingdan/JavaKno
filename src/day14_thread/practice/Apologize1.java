package day14_thread.practice;

import java.util.concurrent.locks.ReentrantLock;

public class Apologize1  {
     static boolean flag = true;
     static ReentrantLock lock = new ReentrantLock();
     static int i = 0;
    public static void main(String[] args) {
        Apo1 apo1 = new Apo1();
        Apo2 apo2 = new Apo2();
        Thread thread1 = new Thread(apo1);
        Thread thread2 = new Thread(apo2);
        thread1.setName("线程1");
        thread2.setName("线程2");
        thread1.start();
        thread2.start();
    }
}
class Apo1 implements Runnable{
    @Override
    public void run() {
        while (Apologize1.i< 100){
            if(Apologize1.flag){
                try {
                    Apologize1.lock.lock();
                    System.out.println(Thread.currentThread().getName()+"我不仅错了");
                    Apologize1.i++;
                    Apologize1.flag = false;
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Apologize1.lock.unlock();
                }
            }
        }
    }
}
class Apo2 implements Runnable{
    @Override
    public void run() {
        while (Apologize1.i< 100){
            if(!Apologize1.flag){
                try {
                    Apologize1.lock.lock();
                    System.out.println(Thread.currentThread().getName()+"我还是个猪");
                    Apologize1.i++;
                    Apologize1.flag = true;
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Apologize1.lock.unlock();
                }
            }
        }

    }
}