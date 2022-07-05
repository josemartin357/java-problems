// nums = [1,2,4,5,6,7,8]
// target = 7
public class BinarySearch {
    public int search(int[] nums, int target) {
        int pivot;
        int left = 0;
        int right = nums.length - 1;//7
        // run this while left pointer less/equal to right
        while (left <= right) {
          // grabbing the middle index
          pivot = left + (right - left) / 2; //pivot is 3 -> nums[3] = 5
          // if the number in middle is the value, return it
          if (nums[pivot] == target){
               return pivot;
          }
          // if target less than value at middle index, search on left. This means to give right the value of the previous pivot - 1. The while loop will recalculate again.
          else if (target < nums[pivot]){
               right = pivot - 1;
          }
          // if target is higher than pivot, move right. This means to give left value of the previous pivot + 1.
          else{
          left = pivot + 1;
          }
        }
        // if target doesnt exist
        return -1;
    }
}