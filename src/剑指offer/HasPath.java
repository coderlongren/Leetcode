package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月16日 下午8:02:59
* 类说明: 
*/
public class HasPath {
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		if(matrix==null || matrix.length==0 || str==null || str.length==0 || matrix.length!=rows*cols || rows<=0 || cols<=0 || rows*cols < str.length) {
            return false ;
        }
 
        boolean[] visited = new boolean[rows*cols] ;
		return false;
        
    }
}
