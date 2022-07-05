/*This program requires checking an array and finding three numbers that = 0.
To do so, we will grab an index and evalue the rest of the array for the other two numbers
First, we sort. Second,loop thru array. Third, recreate 2sum exercise logic in which we check if the other numbers and current index = target */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // first we sort input array
        Arrays.sort(nums);
        // then, we declare Linked List for output
        List<List<Integer>> output_arr = new LinkedList<List<Integer>>();
        // loop to check on second and third number following the index; to do, we dont count last two numbers of length
        for(int i = 0; i < nums.length - 2; i++){
            // if the values at current index and previous index are not the same, then we check the other numbers
            if(i == 0 || (i > 0 && nums[i] != nums[i -  1])){
                // we set low and high boundaries
                int low = i + 1;
                int high = nums.length - 1;
                // looking for the sum other than current index
                // nums[i] + b + c = 0
                // b + c = sum
                // nums[i] + sum = 0
                // Therefore, sum = 0 - nums[i]
                int sum = 0 - nums[i];
                // as long as number on left < number on right
                while(low < high){
                    // we check if 2nd and 3rd number equals sum value
                    if(nums[low] + nums[high] == sum){
                        // if success, save elements in Linked List
                        output_arr.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        // avoiding duplicates: if number on left equals number to its right, skip!!
                        while(nums[low] == nums[low+1]){
                            low ++;
                        }
                        //  avoiding duplicates: if number on right equals number to its left, skip!!
                        while(nums[high] == nums[high-1]){
                            high --;
                        }
                        // we keep incrementing and decrementing as while loop progresses
                        low++;
                        high--;
                    }
                    // if first + second number too large, move left
                    else if(nums[low] + nums[high] > sum){
                        high--;
                    }
                    // if first + second number too small, move right
                    else {
                        low++;
                    }
                }
            }
        }
        return output_arr;
    }
}
