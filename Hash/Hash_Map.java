// package JAVA-DSA.Hash;

import java.util.*;
public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insert
        map.put("India",120);
        map.put("US",30);
        map.put("Chaina",150);

        //Print
        System.out.println(map);  

        //update or creat 
        map.put("India",130);

        System.out.println(map);

        //Search or look up
        if(map.containsKey("India")){
            System.out.println("India is present in the map");
        }

        //get value from key
        System.out.println((map.get("India")));


        //Iterator in HashMap throung entry set
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " : "+ e.getValue());
        }
        System.out.println("-------------------------");
        //Iterator in HashMap throung key set
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key +" : "+map.get(key));
        }


        //Remove
        map.remove("Chaina");
    }
}
