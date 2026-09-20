class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        // search for row
        int targetRow = -1;
        int left = 0, right = m - 1;
        while (left <= right) {
            int midInd = left + (right - left) / 2;
            int[] mid = matrix[midInd];
            if (target < mid[0]) {
                right = midInd - 1;
            } else if (target > mid[n - 1]) {
                left = midInd + 1;
            } else {
                targetRow = midInd;
                break;
            }
        }

        if (targetRow < 0) {
            return false;
        }

        // search inside row
        left = 0; right = n - 1;
        while (left <= right) {

            int midInd = left + (right - left) / 2;
            int mid = matrix[targetRow][midInd];

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
