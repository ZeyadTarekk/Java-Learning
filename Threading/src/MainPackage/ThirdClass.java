package MainPackage;

public class ThirdClass implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from thread " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Runnable ex1 = new ThirdClass();
        Thread t1 = new Thread(ex1);
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello From main Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
