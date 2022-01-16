package homework4.datastructure;

import java.util.HashMap;
import java.util.Map;

public class map3 {



        public static void main(String[] args) {

            Map<String, String> fruit= new HashMap<>();
            fruit.put("Green", "apples");
            fruit.put("yellow", "bananas");
            fruit.put("red", "grapes");
            fruit.put("black", "blackberries");
            for (Map.Entry entry: fruit.entrySet()) {
                System.out.println(entry.getKey()+ " "+entry.getValue());
            }
        }

    }

