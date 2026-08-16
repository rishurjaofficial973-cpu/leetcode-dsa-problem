class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character , Integer> map= new HashMap<>();
        for(int i = 0; i<text.length();i++){
            char ch = text.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
         String word = "balloon";
         int result = Integer.MAX_VALUE;
         for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
           if(!map.containsKey(ch)){
            return 0;
           }
           int count = map.get(ch);
           int balloon = count;
           if(ch=='l'||ch=='o'){
            balloon = count/2;
           } 
           result = Math.min(result,balloon);
         }
        return result;
    }
}