class Solution {
    public int minEatingSpeed(int[] piles, int h) {


        int len = piles.length;
        int max = Arrays.stream(piles).max().getAsInt();
        if (h == len) {
            return max;
        }

        int res = max;
        // binary search
        int left = 1, right = max;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int hours = check(piles, mid);
            if (hours > h) {
                left = mid + 1;
            } else {
                right = mid - 1;
                res = mid;
            }
        }
        

        return res;
        
    }

    // Koko simulator
    public int check(int[] vals, int rate) {
        int res = 0;
        for (int v : vals) {
            if (rate > v) {
                res++;
            } else {
                int q = v / rate;
                int r = v % rate;
                res = r == 0 ? res + q : res + q + 1;
            }
        }
        return res;
    }
}
