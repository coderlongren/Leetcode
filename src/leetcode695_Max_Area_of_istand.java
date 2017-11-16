
public class leetcode695_Max_Area_of_istand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1}};
		System.out.println(grid.length);
		System.out.println(grid[0].length);
		System.out.println(maxAreaOfIsland(grid));
	}
	// DP algorithm 
	public static int maxAreaOfIsland(int[][] grid) {
		int maxArea = 0;
		for (int i = 0; i < grid.length; i++){
			for (int j = 0; j < grid[i].length;j++){
				if (grid[i][j] == 1){
					maxArea = Math.max(maxArea, instand(i, j, grid));
				}
			}
		}
		
		return maxArea;
    }
	public static int instand(int i,int j,int[][] grid){
		if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1){
			grid[i][j] = 0;
			return (1 + instand(i + 1, j, grid) + instand(i - 1, j, grid) + instand(i, j + 1,  grid) + instand(i, j - 1, grid));
			
		}
		else {
			return 0;
		}
		
	}

}
