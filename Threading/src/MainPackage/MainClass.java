package MainPackage;

public class MainClass extends Thread {
    public void run(){
        System.out.println("Hello from Thread "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new MainClass();
        t1.start();
        Thread t2 = new MainClass();
        t2.start();
        System.out.println("Hello from Main Thread "+ Thread.currentThread().getName());
    }

}
