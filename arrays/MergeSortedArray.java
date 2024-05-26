package arrays;

/**
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 **/

public class MergeSortedArray {
    public void merge(int[] nums1, int n, int[] nums2, int m) {
        int i=0, j=0,k=0;
        int sort[] = new int[n+m];
        while(i<n || j<m) {
            if( (i<n && j<m && nums1[i]<=nums2[j])|| j>=m) {
                sort[k++] = nums1[i++];
            }
            else if(j<m){
                sort[k++] = nums2[j++];
            }
        }
        n=n+m;
        for( i=0; i<n; i++) {
            nums1[i] = sort[i];
        }
        sort = null;
    }
}
