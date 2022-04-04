package MainPackage;

public class SecondClass implements Runnable {
    public void run() {
        System.out.println("Hello from Thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable ex1 = new SecondClass();
        Thread t1 = new Thread(ex1);
        t1.start();

        Runnable ex2 = new SecondClass();
        Thread t2 = new Thread(ex2);
        t2.start();

        System.out.println("Hello from main Thread " + Thread.currentThread().getName());
    }

}
