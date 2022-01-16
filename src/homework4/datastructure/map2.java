package homework4.datastructure;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class map2 {

        public static void main(String[] args) {

            List<Integer> Price = new LinkedList<>();
            Price.add(1856);
            Price.add(1635);
            Price.add(1534);
            Price.add(1524);


            List<Integer> IdNumber = new LinkedList<>();
            IdNumber.add(2001);
            IdNumber.add(2002);
            IdNumber.add(2003);
            IdNumber.add(2004);

            List<Integer> Area = new LinkedList<>();
            Area.add(675);
            Area.add(768);
            Area.add(872);
            Area.add(899);

            Map<String, List<Integer>> info = new LinkedHashMap<>();
            info.put("aptPrice", Price);
            info.put("ClientId", IdNumber);
            info.put("aptArea", Area);
            for (Map.Entry entry:info.entrySet()) {
                System.out.println(entry.getKey()+" "+ entry.getValue());
            }
        }



    }

