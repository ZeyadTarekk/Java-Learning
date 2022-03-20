package MainPackage;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean newBool = sc.nextBoolean();
        int newInt = sc.nextInt();
        String newStr = sc.next();
        double newDouble = sc.nextDouble();

        System.out.println(newStr);
    }
}
