class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        // use index algebra
        int left = 0, right = m * n - 1;
        while (left <= right) {
            int midInd = left + (right - left) / 2;
            int mid = matrix[midInd / n][midInd % n];
            if (target == mid) {
                return true;
            } else if (target < mid) {
                right = midInd - 1;
            } else {
                left = midInd + 1;
            }
        }

        return false;
        
    }
}
