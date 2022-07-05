public class ConcatenationArray {
    // method takes in int array nums and returns another int array
    public int[] getConcatenation(int[] nums) {
        // new array takes size of whatever size nums has * 2
        int[] result = new int[nums.length*2];
        // looping thru nums
        for(int i = 0; i < nums.length; i++) {
            // first, new array takes values of previous array. Example: When at index 0, index 0 at result takes value of what nums is storing at index 0 --> result[0] = nums[0]
            result[i] = nums[i];
            // second, do similar previous process but add length of previous array to result index to get second set of elements. Example: result[0 + 3] = nums[0];
            result[i+nums.length] = nums[i];
        }
        // once looping done, return new value of result
        return result;
    }
}
