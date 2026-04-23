 class NumberThread extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Before sleep: Printing number " + i);

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }

            System.out.println("After sleep: Printed number " + i);
        }
    }
}

public class SleepExample {
    public static void main(String[] args) {
        NumberThread t = new NumberThread();
        t.start(); 
    }
}