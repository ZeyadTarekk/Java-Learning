package MainPackage;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newStr = sc.nextLine();
        System.out.println(newStr);
        boolean value = newStr.equals("Zeyad");
        System.out.println(value);
    }
}
