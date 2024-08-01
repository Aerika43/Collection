package Collection;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        //Insertion
        map.put("India", 120);
        map.put("Us",20);
        map.put("China",100);
        map.put("Japan", 200);
        
        System.out.println(map);
        
        map.put("Us", 50);
        System.out.println(map);
        
        //Search
        if(map.containsKey("China"))
        {
            System.out.println("Key is Present");
        }
        else
        {
            System.out.println("Key is not Present");
        }
        
        //Second Method to serach
        System.out.println(map.get("China"));
        System.out.println(map.get("Chinaaa"));
        
        //for(int var : arr)
        
        System.out.println("Hello"+ map.entrySet());
        
        //Iterator
        for(Map.Entry<String, Integer> e: map.entrySet())
        {
        System.out.println(e.getKey() + "  ");
        System.out.println(e.getValue());
        }
        
        //Second method to iterate
        Set<String> keys = map.keySet();
        for(String key : keys)
        {
            System.out.println(key + " " + map.get(key));
        }
        
        // remove the key and get value
        
        map.remove("china");
        System.out.println(map);
    }
}
