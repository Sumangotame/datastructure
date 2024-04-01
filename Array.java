// import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Array {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("volvo");
        cars.add("bmw");
        cars.add("lamborgini");
        cars.addLast("gautam");
        cars.addFirst("suman");
        cars.removeLast();
        cars.set(0,"gautam");
        cars.remove(0);
System.out.println(cars);        
        System.out.println(cars.size());
        cars.add("apple");
        Collections.sort(cars);
        System.out.println(cars);

        for (String name : cars) {
            System.out.println(name);
        }
        cars.clear();
        System.out.println(cars);

    }


}
