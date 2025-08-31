package org.example.JavaConcept.MapIteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------Map Iteration-----------");
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        System.out.println("---- 1.Using entrySet ----");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("---- 2.Using keySet ----");
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        System.out.println("---- 3.Using values ----");
        for (Integer value : map.values()) {
            System.out.println("Value = " + value);
        }

        System.out.println("---- 4.Using forEach lambda ----");
        map.forEach((key, value) -> {
            System.out.println(key + " =>>>> " + value);
            System.out.println(key + " =>>> " + value);
        });

        // 5️⃣ Iterate using Iterator
        System.out.println("---- Using Iterator ----");
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
