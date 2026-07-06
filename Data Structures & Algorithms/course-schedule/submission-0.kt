class Solution {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {

        val state = IntArray(numCourses) {0}
        val graph = HashMap<Int, MutableList<Int>>()

        for(pre in prerequisites){
            val a = pre[0]
            val b = pre[1]
            graph.getOrPut(a){mutableListOf()}.add(b)
        }

        fun dfs(course : Int) : Boolean {
            if(state[course] == 1) return false
            if(state[course] == 2) return true 
            state[course] = 1
            for(neighbours in graph[course]?:emptyList()){
                if(!dfs(neighbours)) return false
            }
            state[course] = 2
            return true
        }

        for(courses in 0 until numCourses){
            if(!dfs(courses)) return false
        }

        return true 
    }
}
