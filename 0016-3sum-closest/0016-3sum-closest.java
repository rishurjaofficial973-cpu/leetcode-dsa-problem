// direct hee optimization kar diya bhaii😈😈
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxdiff = Integer.MAX_VALUE;
        int resultsum = 0;
        for (int i = 0 ; i < n-2 ; i++){
            int left = i + 1;
            int right = n - 1;
            while (left < right){
              int sum = nums[i] + nums[left] + nums[right];
            int diff = Math.abs(sum - target);
            if(maxdiff > diff){
                maxdiff = diff;
                resultsum = sum;
            }

            if(sum < target){
                left ++;
            }
            else if(sum > target){
                right--;
            }
            else{
                return sum ;
            }
  
            }
            

        }

        return resultsum;

    }
}