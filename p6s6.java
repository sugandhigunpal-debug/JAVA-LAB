class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class p6s6 {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) c.increment();
        });

        t1.start();
        t2.start();


        
        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.count);
    }
}
