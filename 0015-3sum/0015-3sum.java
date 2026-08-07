class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    //     Set<List<Integer>> set = new HashSet<>();
    //     int n = nums.length;
    //   for (int i = 0; i < n;i++){
    //     for(int j = i+1; j< n;j++){
    //         for(int k = j+1; k<n ;k++){

    //             if(nums[i]+nums[j]+nums[k] == 0) {
    //                 List<Integer> tikkisum = Arrays.asList(nums[i],nums[j],nums[k]);
    //                 Collections.sort(tikkisum);
    //                 set.add(tikkisum);
    //             }
    //         }
    //     }
        

    //   }  
    //           return new ArrayList<>(set);
    // optimize baad me kar lenge bhai !!!
    // AB HOGA OPTIMIZE !!----- 
     List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

          
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                 
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return ans;


    }
}

