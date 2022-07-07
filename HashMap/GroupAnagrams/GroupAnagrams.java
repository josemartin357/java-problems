package GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
       
       
        //if string empty, return new empty ArrayList
        if (strs.length == 0) return new ArrayList();
       
       
        //HashMap:String key,List value
        Map<String, List> ans = new HashMap<String, List>();
       
       
        //iterate thru every string in array
        for (String s : strs) {
            //for every String, new char array takes the chars of that String
            char[] ca = s.toCharArray();
            // sorting char array
            Arrays.sort(ca);
            // converting char array back to a string
            String key = String.valueOf(ca);
            // if map doesnt contain key(sorted string), add key to map. For value, make an empty ArrayList
            if (!ans.containsKey(key)){
                ans.put(key, new ArrayList());
            }
            // Add the unsorted string(s) of that key as value. This will handle whether that key was already in map or not.
            ans.get(key).add(s);
        }
       
        //return the map values as a list
        return new ArrayList(ans.values());
    }
} 