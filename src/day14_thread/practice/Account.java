package day14_thread.practice;
/**银行有一个账户。
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
 */

/*class MyAccount implements Runnable{
    private int balence = 0;
    @Override
    public void run() {
            int i = 3000;
            while (i>0){
                synchronized (this) {
                    balence += 1000;
                    i -= 1000;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "存了钱，余额为" + balence);
                }
            }

    }
}
public class Account {
    public static void main(String[] args) {
        MyAccount account = new MyAccount();
        Thread t1 = new Thread(account);
        Thread t2 = new Thread(account);
        t1.setName("储户1");
        t2.setName("储户2");
        t1.start();
        t2.start();

    }
}*/
