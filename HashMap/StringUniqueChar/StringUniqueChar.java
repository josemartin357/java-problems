package StringUniqueChar;

import java.util.HashMap;

class StringUniqueChar {
    public int firstUniqChar(String s) {
        // HashMap to hold String characters as keys
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
       
       
        // iterating thru character array of s String
        for(char ch : s.toCharArray()) {
            // add each character to map as key
            // as value, we use getOrDefault to give new chars the value 0; and then we add 1 to reflect that char is now added. By using +1, we ensure that if a char does have a value, we still increase by 1
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
       
       
        // loop thru length of String
        for(int i = 0; i < s.length(); i++) {
            // if the value of map key(equivalent to the string char at index) is 1, return index location
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        // else, return -1
        return -1;
    }
}