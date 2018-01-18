/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月18日 下午3:59:43
* 类说明: 妈妈， 我终于写完了 leetcode上的所有的easy的题目
*/
public class leetcode733_Flood_Fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
	        if (image[sr][sc] == newColor) return image;
	        fill(image, sr, sc, image[sr][sc], newColor);
	        return image;
	    }
	    
	    private void fill(int[][] image, int sr, int sc, int color, int newColor) {
	        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color) return;
	        image[sr][sc] = newColor;
	        fill(image, sr + 1, sc, color, newColor);
	        fill(image, sr - 1, sc, color, newColor);
	        fill(image, sr, sc + 1, color, newColor);
	        fill(image, sr, sc - 1, color, newColor);
	    }

}
