class Solution {
    // recursive soln
    // boolean helper(int[] nums, int i){
    //     if(i >= nums.length){
    //         return false;
    //     }
    //     if(i == nums.length-1){
    //         return true;
    //     }
    //     boolean ans = false;
    //     for(int j = 1; j<=nums[i]; j++){
    //         ans = (ans || helper(nums, i+j));
    //         if(ans == true)
    //         return true;
    //     }

    //     return ans;
    // }
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[nums.length-1] = true;

        for(int i = nums.length-2; i>=0; i--){
            for(int j = 1; j<=nums[i]; j++){
                if(j+i < nums.length && dp[j+i] == true){
                    dp[i] = true;
                }
            }
        }

        return dp[0];
    }
}