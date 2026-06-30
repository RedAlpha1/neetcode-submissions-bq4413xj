/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if(preorder.isEmpty()) return null
        val rootValue = preorder[0]
        val node = TreeNode(rootValue)

        val mid = inorder.indexOf(rootValue)

        val inOrderLeft = inorder.copyOfRange(0, mid)
        val inOrderRight = inorder.copyOfRange(mid+1, inorder.size)

        val preOrderLeft = preorder.copyOfRange(1, mid+1)
        val preOrderRight = preorder.copyOfRange(mid+1, preorder.size)

        node.left = buildTree(preOrderLeft,inOrderLeft)
        node.right = buildTree(preOrderRight, inOrderRight)

        return node
    }
}
