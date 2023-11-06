package IO.MAP;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashQuestion {


        public static void main(String[] args) {

            LinkedHashMap<String, String> capitalMap = new LinkedHashMap<>();


            capitalMap.put("India", "New Delhi.");
            capitalMap.put("Germany", "Berlin");
            capitalMap.put("USA", "Washington D.C");


            System.out.println("Country-Capital Pairs:");
            for (Map.Entry<String, String> entry : capitalMap.entrySet()) {
                String country = entry.getKey();
                String capital = entry.getValue();
                System.out.println(country + " - " + capital);
            }
        }
    }


