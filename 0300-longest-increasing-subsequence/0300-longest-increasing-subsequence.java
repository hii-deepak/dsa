class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int maxi = Integer.MIN_VALUE;

        for(int i = n-1; i>=0; i--){
            int temp = 1;
            for(int j = i+1; j<n; j++){
                if(nums[i] < nums[j]){
                    temp = Math.max(1 + dp[j], temp);
                }
            }
            dp[i] = temp;
            maxi = Math.max(maxi, dp[i]);
        }

        return maxi;
    }
}