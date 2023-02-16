import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class LockSupportDemo {
    static Object objectLock = new Object();
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();

    public static void main(String[] args) {
        Thread a = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"\t come in...");
            LockSupport.park();
            System.out.println(Thread.currentThread().getName()+"\t 被唤醒...");
        },"a");
        a.start();

        Thread b = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"\t 唤醒通知...");
            LockSupport.unpark(a);
        },"b");
        b.start();
    }

    public static void lockAwaitSignal(){
        new Thread(()->{
            lock.lock();
            try{
                System.out.println(Thread.currentThread().getName()+"\t come in...");
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"\t 被唤醒...");
            }finally {
                lock.unlock();
            }
        },"A").start();

        new Thread(()->{
            lock.lock();
            try{
                condition.signal();
                System.out.println(Thread.currentThread().getName()+"\t 唤醒通知");
            }finally {
                lock.unlock();
            }
        },"B").start();
    }

    public static void synchronizedWaitNotify(){
        new Thread(()->{
            synchronized (objectLock){
                System.out.println(Thread.currentThread().getName()+"\t come in...");
                try {
                    objectLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"\t 被唤醒");
            }
        },"A").start();

        new Thread(()->{
            synchronized (objectLock){
                objectLock.notify();
                System.out.println(Thread.currentThread().getName()+"\t 唤醒通知");
            }
        },"B").start();
    }
}
