import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月5日 下午6:22:17
* 类说明: 
*/
public class leetcode131_PalindromePartitionng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<String>> partition(String s) {
		   List<List<String>> list = new ArrayList<>();
		   backtrack(list, new ArrayList<>(), s, 0);
		   return list;
		}

		public void backtrack(List<List<String>> list, List<String> tempList, String s, int start){
		   if(start == s.length())
		      list.add(new ArrayList<>(tempList));
		   else{
		      for(int i = start; i < s.length(); i++){
		         if(isPalindrome(s, start, i)){
		            tempList.add(s.substring(start, i + 1));
		            backtrack(list, tempList, s, i + 1);
		            tempList.remove(tempList.size() - 1);
		         }
		      }
		   }
		}

		public boolean isPalindrome(String s, int low, int high){
		   while(low < high)
		      if(s.charAt(low++) != s.charAt(high--)) return false;
		   return true;
		} 

}
