package MainPackage;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {
    public static void main(String[] args) {
        Set<Integer> t = new HashSet<Integer>();
        t.add(3);
        t.add(7);
        t.add(89);
        System.out.println(t);
        System.out.println("Trying contains method");
        System.out.println(t.contains(3));
        System.out.println(t.contains(5));
        System.out.println("Trying remove method");
        System.out.println(t.remove(6));
        System.out.println(t.remove(3));
        System.out.println(t);
        System.out.println("The size of the set before clearing: " + t.size());
        t.clear();
        System.out.println("The size of the set after clearing: " + t.size());
        System.out.println(t);

        Set<Integer> newSet = new TreeSet<Integer>();
        newSet.add(10);
        newSet.add(15);
        newSet.add(7);
        System.out.println(newSet);
    }
}
