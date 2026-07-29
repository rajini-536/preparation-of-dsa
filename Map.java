import java.util.*;

public class Map{ 
    public static void main (String args[]){ 
        int arr[] = {10, 100, 10, 9, 9}; 
        Map<Integer, Integer> m = new HashMap<>(); 
        
        // Loop 1: Populate the map with frequencies
        for (int temp : arr) { 
            if (m.containsKey(temp)) { 
                m.put(temp, m.get(temp) + 1); 
            } else { 
                m.put(temp, 1); 
            } 
        } 
        
        // Loop 2: Find the first element with a frequency of 1
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) { 
            if (entry.getValue() == 1) { 
                System.out.println(entry.getKey()); 
                break; 
            } 
        } 
    } 
}