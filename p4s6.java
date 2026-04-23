 class MyThread extends Thread{
    public String threadName;

    public MyThread(String name) {
        threadName = name;
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " count " + i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(threadName + " finished");
            }
        }
    }
}

public class p4s6{
    public static void main(String[] args) {
        MyThread t1=new MyThread("Thread 1");
        MyThread t2=new MyThread("Thread 2");
        MyThread t3=new MyThread("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch ( InterruptedException e) {
            System.out.println("Main thread intrerrupted");
        }
        System.out.println("all thraeds have finished");
    }
}