class Solution {
    public void helper(int[] nums, int count, List<Integer> temp, List<List<Integer>> ans, boolean[] visited){
        if(count == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i<nums.length; i++){
            if(!visited[i]){
                temp.add(nums[i]);
                visited[i] = true;
                helper(nums, count+1, temp, ans, visited);
                visited[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(nums, 0, new ArrayList<Integer>(), ans, new boolean[nums.length]);

        return ans;
    }
}