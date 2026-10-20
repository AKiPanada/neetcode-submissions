class Solution {
    public int findMin(int[] nums) {

        int length = nums.length;

        if (nums[0] < nums[length-1]) return nums[0];

        int li = 0;
        int ri = length - 1;

        while (li < ri) {
            int mi = li + (ri - li) / 2;
            if (nums[li] == nums[ri]) {
                ri--;
            } else if (nums[mi] > nums[ri]) {
                li = mi + 1;
            } else {
                ri = mi;
            }
        }

        return nums[li];
        
    }
}
