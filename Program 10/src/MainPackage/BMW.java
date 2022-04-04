package MainPackage;

public class BMW extends Car {

    private String modelNumber;

    public BMW(){
        super();
        modelNumber = "";
    }
    public BMW(String m,String num){
        super("BMW",m);
        this.modelNumber = num;

    }
    public void printFields(){
        System.out.println("This car is BMW model: "+ this.modelYear+ " and model number: "+this.modelNumber);
    }
}
