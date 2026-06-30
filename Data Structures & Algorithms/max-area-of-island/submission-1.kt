class Solution {
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        var maxArea = 0
        for(i in 0 until grid.size){
            for(j in 0 until grid[0].size){
                if(grid[i][j] == 1){
                    val area = dfs(grid, i, j)
                    maxArea = maxOf(area, maxArea)
                }
            }
        }
        return maxArea
    }

    fun dfs(grid : Array<IntArray>, i : Int, j : Int) : Int{
        if(i < 0 || i > grid.size-1 || j<0 || j > grid[0].size -1 || grid[i][j] == 0 ) return 0
        grid[i][j] = 0
        var area = 1
        area +=dfs(grid, i, j+1)
        area +=dfs(grid, i, j-1)
        area +=dfs(grid, i-1, j)
        area +=dfs(grid, i+1, j)
        return area
    }
}
