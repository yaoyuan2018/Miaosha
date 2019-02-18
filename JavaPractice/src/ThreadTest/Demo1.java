package ThreadTest;

/**
 * @Author: Y_uan
 * @Date: 2019/2/14 10:31
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Demo1 {
    private static int count = 100;

    public static void main(String[] args) {
        //用继承Thread类的方式启动一个线程
        new Thread(){
            public void run() {
                synchronized (Demo1.class){
                    while(count > 0){
                        count--;
                        System.out.println(Thread.currentThread() + "卖了一张票，还剩" + count);
                    }
                }
            }
        }.start();

        //用实现Runnable接口的方式启动一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (Demo1.class){
                    while (count > 0){
                        count--;
                        System.out.println(Thread.currentThread() + "卖了一张票，还剩" + count);
                    }
                }
            }
        }).start();
    }
}
