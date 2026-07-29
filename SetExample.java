import java.util.*;

public class SetExample { 
    public static void main (String args[]){ 
        int arr[] = {1,2,3,4,5}; 
        HashSet< Integer > h  = new HashSet<>(); 
        
        for (int el : arr) { 
            h.add(el);
            
               
            } 
            System.out.println(h);
        } 
    } 
