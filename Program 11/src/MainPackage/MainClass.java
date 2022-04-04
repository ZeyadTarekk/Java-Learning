package MainPackage;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(Dog.number);
        Dog d1 = new Dog(12, "Rex");
        d1.print();
        Dog d3 = new Dog(20, "Mego");
        d3.print();

        Dog.display();
    }
}
