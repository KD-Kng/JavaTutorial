package hashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();    // hashMap object created
        hashMap.put("India", "Delhi");              // Adding key/value pair to hashMap
        hashMap.put("USA", "Washington");

//        System.out.println(hashMap);          // Printing the hashMap(key and its value)
        System.out.println(hashMap.get("India"));     // Printing the value of a key from hashMap

//        for(String i : hashMap.keySet()){                     // Printing the Key and value from hashMap
//            System.out.println(i + "\t" + hashMap.get(i));    // using a for loop using the keys
//        }

        for (String i : hashMap.values()) {             // Printing the values from hashMap using a for loop
            System.out.println(i);
        }
    }
}



