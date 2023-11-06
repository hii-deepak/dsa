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
    public int findIndex(int x, int[] inOrder){
        for(int i = 0; i<inOrder.length;i++){
            if(inOrder[i] == x)
            return i;
        }
        return -1;
    }
    public TreeNode helper(int[] preOrder, int[] inOrder, int sp, int ep, int si, int ei){
        
        if(sp > ep || si > ei)
        return null;
        
        TreeNode root = new TreeNode(preOrder[sp]);

        int index = findIndex(preOrder[sp], inOrder);
        root.left=helper(preOrder, inOrder, sp+1, sp+index-si, si, index-1);
        root.right = helper(preOrder, inOrder, sp+index-si+1,ep,index+1, ei);

        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return helper(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
        
    }
}