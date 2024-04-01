import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> CapitalCities = new HashMap<String, String>();
        CapitalCities.put("Nepal", "Kathmandu");
        CapitalCities.put("usa", "washingtondc");
        CapitalCities.put("uk", "london");
        CapitalCities.remove("uk");
        System.out.println(CapitalCities);
        System.out.println(CapitalCities.size());
   for(String key:CapitalCities.keySet()){
    System.out.println(key+": "+CapitalCities.get(key));
   }

    }

}