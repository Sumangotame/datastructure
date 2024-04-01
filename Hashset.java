import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<String>();
        cities.add("Kathmandu");
        cities.add("Banepa");
        cities.remove("Banepa");
        cities.add("Banepa");
        cities.add("Dhulikhel");
        System.out.println(cities);
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // boolean isPresent = false;

        // for (String i : cities) {

        //     if (i.contains("Dhulikhel")) {
        //         System.out.println("item is present");
        //         isPresent = true;
        //         break;
        //     }
        // }
        // if (!isPresent) {
        //     System.out.println("items is not present");
        // }

    }

}
