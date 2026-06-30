/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        val list = mutableListOf<Int>()
        fun inOrder(root : TreeNode?) {
            if(root == null) return 
            inOrder(root.left)
            list.add(root.`val`)
            inOrder(root.right)
        }
        inOrder(root)
        return list[k-1]
    }
}
