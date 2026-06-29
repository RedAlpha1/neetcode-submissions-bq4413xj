/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
       return depth(root) != -1 
    }

    fun depth(node : TreeNode?) : Int {
        if(node == null) return 0
        var left = depth(node.left)
        var right = depth(node.right)
        if(left == -1 || right == -1) return -1
        if(Math.abs(left - right) > 1) return -1
        return 1 + maxOf(left,right) 

    }


}
