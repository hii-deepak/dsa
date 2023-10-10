class Solution {
    public boolean isIdealPermutation(int[] nums) {
        // brute force below
        // int gInversion = 0;
        // int lInversion = 0;
        // for(int i = 0; i<nums.length; i++){
        //     for(int j = i+1; j<nums.length; j++){
        //         if(nums[i] > nums[j]){
        //             gInversion ++;

        //         }
        //     }
        //     if(i+1 < nums.length){
        //         if(nums[i] > nums[i+1])
        //         lInversion++;
        //     }
        // }

        // if(gInversion == lInversion)
        // return true;
        // else 
        // return false;

        // optimized below
        // approach is all local inversion are global inversion but not Global inversion
        // are local so, //logic from nick white yt channel

        int max = -1;

        for(int i = 0; i<nums.length-2; i++){

            max = Math.max(nums[i], max);
            if(max > nums[i+2])
            return false;

        }

        return true;

    }
}