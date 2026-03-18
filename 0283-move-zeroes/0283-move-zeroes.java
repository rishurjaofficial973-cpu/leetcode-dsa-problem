class Solution {
    public void moveZeroes(int[] nums) {
             int pos= 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                pos++; 
            }
            else if (pos > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-pos]=t;
            }
        }  
    }
}