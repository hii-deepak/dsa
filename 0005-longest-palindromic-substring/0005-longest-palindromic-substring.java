class Solution {
    public String longestPalindrome(String s) {


        String ans = "";
        for(int i = 0 ;i<s.length(); i++){
            String sub = palin(s, i, i); // odd length
            String sub2 = palin(s, i, i+1); // even length
            if(sub.length() > sub2.length()){
                if(sub.length() > ans.length()){
                ans = sub;
                }
            }
            else{

                if(sub2.length() > ans.length()){
                ans = sub2;
               }

            }
            
            

        }

        return ans;
        
    }

    String palin(String s, int left, int right){
        while(left>= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return s.substring(left+1, right);
    }
}