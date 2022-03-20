package MainPackage;

public class MainClass {
    public static void main(String[] args) {
        String[] newArr = new String[5];
        newArr[0] = "Zeyad";
        System.out.println(newArr[1]);
        newArr[2] = "Hello";
        System.out.println(newArr[2]);
        int[] intArr = {5, 2, 1, 4};
        for (int elem : intArr) {
            System.out.println(elem);
        }
    }
}
