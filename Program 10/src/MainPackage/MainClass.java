package MainPackage;

public class MainClass {
    public static void main(String[] args) {
        BMW c1 = new BMW("2012", "340i");
        c1.printFields();
        System.out.println(c1.modelYear);
    }
}
