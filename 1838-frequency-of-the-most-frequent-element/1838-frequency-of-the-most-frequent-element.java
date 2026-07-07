import java.util.*;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long total = 0;
        int left = 0, ans = 1;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];

            // check cost for current window
            while ((long) nums[right] * (right - left + 1) - total > k) {
                total -= nums[left];
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}