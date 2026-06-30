/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        var min = Int.MIN_VALUE
        var max = Int.MAX_VALUE
        return validate(root, min,max)

    }

    fun validate(root : TreeNode?, min : Int, max :Int) : Boolean {
        if(root == null) return true
        if(root.`val` <= min || root.`val` >= max) return false
       return validate(root.left, min, root.`val`) &&
        validate(root.right, root.`val`, max)
    }
}
