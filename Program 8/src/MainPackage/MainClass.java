package MainPackage;
import java.util.ArrayList;
import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(5);
        t.add(11);
        t.add(23);
        t.add(600);
        t.add(700);
        t.set(1, 21);
        System.out.println(t.size());
        System.out.println(t.isEmpty());
        System.out.println(t.get(1));
        System.out.println(t);
        System.out.println(t.subList(1,4));

        LinkedList<Integer> f = new LinkedList<Integer>();
        f.add(5);
        f.add(11);
        f.add(23);
        f.add(600);
        f.add(700);
        f.set(1, 21);
        System.out.println(f.size());
        System.out.println(f.isEmpty());
        System.out.println(f.get(1));
        System.out.println(f);
        System.out.println(f.subList(1,4));
    }
}
