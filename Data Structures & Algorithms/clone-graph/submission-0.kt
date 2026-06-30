/*
Definition for a Node.
class Node(var `val`: Int) {
    var neighbors: ArrayList<Node?> = ArrayList()
}
*/

class Solution {
    fun cloneGraph(node: Node?): Node? {

        val visited = HashMap<Node, Node>()

        fun dfs(node : Node) : Node {
            if(visited.contains(node)) return visited[node]!!
            val clone = Node(node.`val`)
            visited[node] = clone
            for(i in node.neighbors){
                clone.neighbors.add(dfs(i!!))
            }
            return clone
        }
        if(node == null) return null
        return dfs(node)

    }
}
