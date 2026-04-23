 class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }
}

public class p5s6 {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Low");
        PriorityThread t2 = new PriorityThread("Normal");
        PriorityThread t3 = new PriorityThread("High");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}