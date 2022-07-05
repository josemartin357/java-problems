import java.util.ArrayList;
import java.util.Arrays;

/*Solution

This exercise requires to grab two arrays and find a way to combine them into the first array. Here we use an ArrayList to hold the values of the two arrays, and from the ArrayList we copy back to the first array by the index and finally sort.*/

class MergeSortedArray {
    // method returns nothing
    // method takes in two int arrays and two int variables
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // making new ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // looping nums1 until the length of m...
        for(int i=0 ; i<m ; i++){
            // and adding the elements to new ArrayList
            arr.add(nums1[i]);
        }
        // looping nums2 until the length of n
        for(int j=0 ; j<n ; j++){
            // and adding the elements to new ArrayList
            arr.add(nums2[j]);
        }
        // looping thru new ArrayList ...
        for(int i=0 ; i<arr.size() ; i++){
            // and giving nums1 the values at the same index
            nums1[i]=arr.get(i);
        }
        // finally sort array nums1 in increasing order
        Arrays.sort(nums1);
    }
}