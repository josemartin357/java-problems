/* Solution

Using Separate Space

Intuition

We are required to find the running sum of numbers nums[i] in the input array where i ranges from 0 to n-1 and n is the size of the input array. We can see that the running sum is the sum of all of the elements from index 0 to index i inclusive. Since we start building our output array at index 0, at each index i we have already calculated the sum of all numbers up to and including index i-1. Thus, instead of recalculating the sum, we can get the result for index i by simply adding the element at index i to the previously calculated running sum for index i-1.

Algorithm

Define an array result.
Initialize the first element of result with the first element of the input array.
At index i append the sum of the element nums[i] and previous running sum result[i - 1] to the result array.
We repeat step 3 for all indices from 1 to n-1. */

public class Sum1DArray {
    public int[] runningSum(int[] nums) {
        // make new array of size of nums
        int[] runningSum = new int[nums.length];
        // assign runningSum[0] value of nums[0]
        runningSum[0] = nums[0];
        // loop to run thru every index in nums and add values to runningSum
        for(int i = 1; i < nums.length; i++ ){
         runningSum[i]= runningSum[i - 1] + nums[i];
         }
        // return runningSum
        return runningSum;
    }
}
