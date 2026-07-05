class Solution {
    fun orangesRotting(grid: Array<IntArray>): Int {

        var freshOrange = 0
        var time = 0
        val queue = ArrayDeque<Pair<Int,Int>>()
        for(r in 0 until grid.size){
            for(c in 0 until grid[0].size){
                if(grid[r][c] == 1){
                    freshOrange += 1 
                }
            }
        }

        for(r in 0 until grid.size){
            for(c in 0 until grid[0].size){
                if(grid[r][c] == 2){
                    queue.addLast(Pair(r,c))
                }
            }
        }
        val directions = listOf(Pair(0,1),Pair(0,-1),Pair(-1,0),Pair(1,0))
        while(queue.isNotEmpty()){
        repeat(queue.size){
            val (r,c) = queue.remove()
            for((dr,dc) in directions){
                val nr = r + dr
                val nc = c + dc
                if(nr < 0 || nr >=grid.size || nc < 0 || nc >= grid[0].size) continue
                if(grid[nr][nc] == 1){
                    grid[nr][nc] = 2
                    freshOrange--
                    queue.addLast(Pair(nr,nc))
                }
            }
        }
       if(queue.isNotEmpty()) time++
        }
       if(freshOrange == 0) return time else return -1
    }
}
