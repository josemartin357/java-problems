public class TruncateSentence {
     // method takes string and int; and returns string
     public String truncateSentence(String s, int k) {
        // empty variable to hold empty spaces
        int count = 0;
        // loop thru String s to get their indes
        for(int i = 1; i < s.length(); i++){
            // use counter to add " "
            if(s.charAt(i) == ' '){
                count++;
            }
             // use if to stop when amount of " " equals k
            if(count == k){
                // make a subarray from index 0 to k -1
                s = s.substring(0, i);
                break;
            }
        }
        return s;
    }
}
