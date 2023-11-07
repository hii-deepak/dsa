class Solution {
    public int houseRobber1(int[] nums, int s, int e){
        int prevPrev = 0;
        int prev = nums[s];

        for(int i = s+1; i<=e; i++){
            int temp = Math.max((nums[i] + prevPrev), prev);
            prevPrev = prev;
            prev = temp;
        }

        return prev;
    }
    public int rob(int[] nums) {
        if(nums.length == 1)
        return nums[0];
        int op1 = houseRobber1(nums, 0, nums.length-2);
        int op2 = houseRobber1(nums, 1, nums.length-1);
        return Math.max(op1, op2);
    }
}