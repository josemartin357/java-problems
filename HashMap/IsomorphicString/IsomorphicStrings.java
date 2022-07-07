package IsomorphicString;

import java.util.HashMap;

public class IsomorphicStrings {
     // method takes two strings and returns a boolean
     public boolean isIsomorphic(String s, String t) {
        
        // if first String has no characters, or is only one, boolean will be true
        if(s == null || s.length() <= 1){
            return true;
        } 
        
        // creating HashMap for keys = chars from 1st String; and values = chars from 2nd String
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        
        // looping thru 1st String
        for(int i = 0 ; i< s.length(); i++){
            // in each loop, store each index' letter from each String
            char a = s.charAt(i); 
            char b = t.charAt(i); 
            
            // in each loop, check if map has a key named like value of char a            
            if(map.containsKey(a)){
                // if key exists, check if value at that key equals char b
                // example: d-> g; if g = g, then it works. If g is another letter; then it wont.
                if(map.get(a).equals(b)){
                    continue;    
                }    
                // if values different, return false as boolean
                else{
                    return false;    
                }
            }
            // in each loop, if map doesnt have a key like value of char a
            else{
                // we check if map doesnt contain a value just like char b
                if(!map.containsValue(b))
                    // and we put the value of char b at a key a
                    map.put(a,b); 
                // if map has that value stored, then it was assigned to another key and therefore return false as boolean
                else{
                    return false;  
                } 
            }
        }
        // if all conditions passed, return true
        return true;
    }
}
