package day14_thread.practice;

public class Apologize implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i++ < 100){
            synchronized (this){
                this.notifyAll();
                System.out.println(Thread.currentThread().getName()+"我错了");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class exer{
    public static void main(String[] args) {
        Apologize apologize = new Apologize();
        Thread thread1 = new Thread(apologize);
        Thread thread2 = new Thread(apologize);
        Thread thread3 = new Thread(apologize);

        thread1.setName("线程1");
        thread2.setName("线程2");
        thread3.setName("线程3");

        thread1.start();
        thread2.start();
        thread3.start();


    }
}
