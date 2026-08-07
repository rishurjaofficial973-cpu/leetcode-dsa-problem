class Solution {
    public int[] sortedSquares(int[] nums) {

    //   for(int i =0; i<nums.length;i++){
    //     nums[i] = nums[i] * nums[i] ;

    //   }  
    //   Arrays.sort(nums);
    //   return nums;

  
// optimize karenge baad me be 
// AB KARENGE OPTIMIZATION !!
int i = 0;
int j = nums.length - 1;
int k = nums.length - 1;

int[] arr = new int[nums.length];

  while(i<=j){
    int  leftsquare = nums[i] * nums[i];
    int  rightsquare = nums[j] * nums[j];

      if(leftsquare > rightsquare ){
          arr[k] = leftsquare ;
          i++;
          k--;
    }
      else {
         arr[k] = rightsquare;
          j--;
          k--;
      }
  }
  return arr;
}
}