class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEndingHere = 0;
        int minEndingHere = 0;
        int maxSum = 0;
        int minSum = 0;

        for (int num : nums) {
            maxEndingHere = Math.max(num, maxEndingHere + num);
            maxSum = Math.max(maxSum, maxEndingHere);

            minEndingHere = Math.min(num, minEndingHere + num);
            minSum = Math.min(minSum, minEndingHere);
        }

        return Math.max(maxSum, -minSum);
    }
}