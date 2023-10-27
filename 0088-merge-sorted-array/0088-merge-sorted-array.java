class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0, k = 0;
        int end = m;
        while(i < end && j < n){
            if(nums1[i] > nums2[j]){
                int last = end;
                end++;
                while(last > k){
                    nums1[last] = nums1[last-1];
                    last--;
                }
                i++; 
                nums1[k] = nums2[j];
                j++;
                k++;
            }
            else{
                i++;
                k++;
            }
        }
        
        while(j<n){
            nums1[k++] = nums2[j++]; 
        }
    }
}