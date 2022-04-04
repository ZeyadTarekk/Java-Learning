package MainPackage;

public class Car {
    private String name;
    protected String modelYear;

    public Car() {
        name = "";
        modelYear = "";
    }

    public Car(String n, String year) {
        this.name = n;
        this.modelYear = year;
    }

    public void printFields() {
        System.out.println("Car name: " + name);
        System.out.println("Model Year: " + modelYear);
    }

    public String getName(){
        return this.name;
    }

    public String getModelYear(){
        return this.modelYear;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setModel(String m){
        this.modelYear = m;
    }

}
