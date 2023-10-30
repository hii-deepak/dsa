class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        return 0;
        int lastPrev = Integer.MIN_VALUE;
        int count = 0;
        int ans = 1;
        Arrays.sort(nums);

        for(int i = 0; i<nums.length; i++){
            if(nums[i]-1 == lastPrev){
                count++;
                lastPrev = nums[i];
                
            }else if(lastPrev != nums[i]){
                count  = 1;
                lastPrev = nums[i];
            }
            ans = Math.max(count, ans);
        }

        return ans;
    }
}