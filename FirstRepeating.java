import java.util.*;

public class FirstRepeating{ 
    public static void main (String args[]){ 
        int arr[] = {1,2,3,4,5}; 
        HashSet<Character> h  = new HashSet<>(); 
        String s = "abcab";
        char []ch = s. toCharArray();
        
        for (char c : s.toCharArray()) { 
            if(h.contains(c)){
                System.out.println(c);
                break;
            }
            else{
                h.add(c);
            }
               
            } 
    } 
}
