class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i = 0;
        int j = 0;
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(j < s.length()){
            if(map.containsKey(s.charAt(j))){
                int lastValue = map.get(s.charAt(j));
                ans = Math.max(ans, j-i);
                map.clear();
                i = lastValue+1;
                j = i;
            }
            else{
                map.put(s.charAt(j), j);
                j++;
                if(j == s.length()){
                    ans = Math.max(ans, j-i);
                }
            }

            
            
            
        }

        return ans;
    }
}