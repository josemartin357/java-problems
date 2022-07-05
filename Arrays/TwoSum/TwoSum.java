package Arrays.TwoSum;

class TwoSum {
    // method returns an array
    public int[] twoSum(int[] nums, int target) {
        // first loop checks each element in array
        for(int i = 0; i < nums.length; i++){
            // second loop checks other elements ln array
            for(int j = i +1; j < nums.length; j++){
                // if one number equals target - another number
                if(nums[j] == target - nums[i]){
                    // we found two numbers needed so we add them to the array
                    return new int[] {i, j};
}
            }
}
        // else if nothing found, return null
        return null;
       
    }
}