package DFS;
/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月29日 下午7:58:40
* 类说明:  这还需要用DFS？  please receive my kneels
*/
public class leetcode463_island_perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		islandPerimeter(grid);
	}
	public static int islandPerimeter(int[][] grid) {
		
		int lenX = grid[0].length;
		int lenY = grid.length;
		int[][] newgrid = new int[lenY + 2][lenX + 2];
		int count = 0;
		
		for (int i = 1; i < newgrid.length - 1; i++){
			for (int j = 1; j < newgrid[0].length - 1; j++){
				newgrid[i][j] = grid[i - 1][j - 1]; 
			}
		}
		for (int i = 1; i < newgrid.length - 1; i++){
			for (int j = 1; j < newgrid[0].length - 1; j++){
				if (newgrid[i][j] == 1){
					if (newgrid[i][j - 1] == 0){
						count++;
					}
					if (newgrid[i - 1][j] == 0){
						count++;
					}
					if (newgrid[i + 1][j] == 0){
						count++;
					}
					if (newgrid[i][j + 1] == 0){
						count++;
					}
					
				}
			}
		}
		
//		
//		
//		for (int i = 0; i < newgrid.length; i++){
//			for (int j = 0; j < newgrid[0].length; j++){
//				System.out.print(newgrid[i][j] + " ");
//			}
//			System.out.println();
//		}
		return count;
	
		
	}

}
