package MainPackage;

public class MainClass {
    public static void main(String[] args) {
        zeyadFunc("Ahmed");
        Car c1 = new Car();
        c1.printFields();
        Car c2 = new Car("Jeep", "2022");
        c2.printFields();
        System.out.println(c2.getName());
        System.out.println("C1 after setting");
        c1.setModel("2022");
        c1.setName("KIA");
        c1.printFields();

    }



    public static void zeyadFunc(String name){
        System.out.println("Hello From " +name+ " Funcion");
    }
}
