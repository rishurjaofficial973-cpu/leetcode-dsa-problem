class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer , Integer > map = new HashMap<>();
        // bhai ab har ek element ka frequency h mere pass 
          int left = 0 ;
          int maxlength = 0;
          int k = 2;
          int n = fruits.length;
        for(int right =0 ; right < n;right++){
            int num = fruits[right];
            map.put(num,map.getOrDefault(num,0)+1);

            while(map.size()>k){
                int leftchar = fruits[left];
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0){
                    map.remove(leftchar);
                }
                left++;
            }
            if(map.size()<=k){
                maxlength = Math.max(maxlength,right-left+1);
            }
        }
        return maxlength;
    }
}