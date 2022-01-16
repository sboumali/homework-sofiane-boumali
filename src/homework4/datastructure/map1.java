package homework4.datastructure;

import java.util.*;

public class map1 {
    public static void main(String [] args){

        Map<String, String> fruit = new HashMap<>();
        fruit.put("red", "apple");
        fruit.put("yellow", "banana");
        fruit.put("white", "radish");

        System.out.println(fruit.get("red"));

        List<String> SeasonsOffruit = new ArrayList<>();
        SeasonsOffruit.add("winter");
        SeasonsOffruit.add("spring");
        SeasonsOffruit.add("summer");

        List<String> SeasonsOfCountries = new ArrayList<>();
        SeasonsOfCountries.add("Algeria");
        SeasonsOfCountries.add("Spain");
        SeasonsOfCountries.add("USA");


        Map<String, List<String>> map = new LinkedHashMap<>();
        map.put("Algeria", SeasonsOfCountries);
        map.put("Spain",SeasonsOfCountries);
        map.put("USA", SeasonsOfCountries);

        for (int i=0; i < map.size(); i++){

        }

        System.out.println(map.size());

    }
}


