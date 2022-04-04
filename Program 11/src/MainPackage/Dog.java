package MainPackage;

public class Dog {
    protected int age;
    protected String name;
    protected static int number = 0;

    public Dog(int age, String n) {
        this.age = age;
        this.name = n;
        Dog.number++;
    }

    public void print() {
        System.out.println("Age: " + age + " Name: " + name + " Number till now: " + number);
    }
}
