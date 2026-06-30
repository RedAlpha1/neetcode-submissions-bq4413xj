class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var islandCounter = 0
        for(i in 0 until grid.size){
            for(j in 0 until grid[i].size){
                if(grid[i][j]=='1'){
                dfs(grid, i, j)
                islandCounter++
            }
            }
        }
        return islandCounter
    }

    fun dfs(grid : Array<CharArray>, i : Int, j : Int){
        if(i < 0 || i > grid.size-1 
        || j < 0 || j > grid[0].size-1 || grid[i][j]=='0') return
        grid[i][j] = '0'
        dfs(grid, i-1, j)
        dfs(grid, i+1, j)
        dfs(grid, i, j+1)
        dfs(grid, i, j-1)
    }
}
