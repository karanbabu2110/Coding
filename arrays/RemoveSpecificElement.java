package arrays;

/**
Given an Integer array nums and int val to be removed from the array.

Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
**/

public class RemoveSpecificElement {
    public int removeElement(int[] nums, int val) {
        int i = 0, n = nums.length;
        while(i<n) {
            if(nums[i] == val) {
                nums[i] = nums[--n];
            }
            else{
                i++;
            }
        }
        nums = null;
        return n;
    }
}