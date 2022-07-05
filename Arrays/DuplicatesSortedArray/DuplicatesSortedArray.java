/* Approach 1: Two Pointers

Algorithm

Since the array is already sorted, we can keep two pointers i and j, where i is the slow-runner while  j is the fast-runner. As long as nums[i]=nums[j], we increment j to skip the duplicate.

When we encounter nums[j]  =nums[i], the duplicate run has ended so we must copy its value to nums[i+1].
i is then incremented and we repeat the same process again until j reaches the end of array.
1:06
Complexity analysis

Time complextiy :
O(n). Assume that n is the length of array. Each of i and j traverses at most n steps.

Space complexity :
O(1). */

// nums = [1,2,3,3]
class DuplicatesSortedArray {
    // method takes array of integers and returns integer
    public int removeDuplicates(int[] nums) {
        // if the length is zero, return 0
        if (nums.length == 0){
             return 0;
        }
        // setting initial value to i
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            // if the j index not equal to previous index (as i), give
            // $ if nums[1] != nums[0] ... 2 not equal to 1,
            // $$ if nums[2]] != nums[1] ... 3 not equal to 2,
            // $$$ nums[3] = nums[2]... therefore, we ignore this situation
            if (nums[j] != nums[i]) {
                // increase i
                // $ nums[1]
                // $ nums[2]
                i++;
                // $ nums[1] = nums[1] ... nums[1] = 2 ... nums = [1,2,3,3]
                // $$ nums[2] = nums[2]... nums[2] = 3 ... nums = [1,2,3,3]
                nums[i] = nums[j];
            }
        }
        // returning value of i + 1 to get amount of unique numbers
        // $$$ returning 3 for nums = [1,2,3,3]
        return i + 1;
    }
}