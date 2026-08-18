class Solution {
    public int characterReplacement(String s, int k) {
      HashMap <Character , Integer> map = new HashMap<>();
      int left =0;
      int maxfrequency = 0;
      int maxlength = Integer.MIN_VALUE;
      for(int right = 0 ; right < s.length();right++){
           char ch = s.charAt(right);
           map.put(ch,map.getOrDefault(ch,0)+1);
           maxfrequency = Math.max(maxfrequency,map.get(ch));
           while((right - left + 1) - maxfrequency > k){
              char leftchar = s.charAt(left);
              map.put(leftchar,map.get(leftchar)-1);
              left++;
           }
            maxlength = Math.max(maxlength, right-left+1 );
        }
         return maxlength; 
    }
}