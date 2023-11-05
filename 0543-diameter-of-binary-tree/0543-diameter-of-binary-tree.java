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
    static class Pair{
        int height;
        int diameter;
        Pair(){

        }
        Pair(int h, int d){
            height = h;
            diameter = d;
        }
    }
    public Pair find(TreeNode root){
        if(root == null){
            return new Pair(0, 0);
        }
        
        Pair left = find(root.left);
        Pair right = find(root.right);

        Pair p = new Pair();
        int option1 = left.height + right.height;
        int height = 1 + Math.max(left.height, right.height);
        int diameter = Math.max(option1, Math.max(left.diameter, right.diameter));

        p.height = height;
        p.diameter = diameter;

        return p;

    }
    public int diameterOfBinaryTree(TreeNode root) {

        Pair p = find(root);
        return p.diameter;
        
    }
}