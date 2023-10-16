/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null)
        return ans;

        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> arr = new ArrayList<>();
            for(int i = 0; i<size; i++){
                TreeNode first = q.remove();
                arr.add(first.val);
                if(first.left != null){
                    q.add(first.left);
                }
                if(first.right != null){
                    q.add(first.right);
                }
            }

            ans.add(new ArrayList<>(arr));
            arr.clear();
            

        }

        return ans;
    }
}