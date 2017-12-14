/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月14日 下午9:59:54
* 类说明: 去掉那些很多空格的片段
*/

public class leetcode434_NumberOfSegments_in_a_stirng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello,    my name is John");
		System.out.println(countSegments("Hello, my name is John"));
		
	}
	public static int countSegments(String s) {
	    int res=0;
	    for(int i=0; i<s.length(); i++)
	        if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
	            res++;        
	    return res;
	}
	int count(String string){
		if (string.length() == 0 || string == null){
			return 0;
		}
		string = string.trim();
		int count = 0;
		for (int i = 0; i < string.length(); i++){
			if (string.charAt(i) == ' '){
				count++;
			}
		}
		if (count == 0){
			return 1;
		}
		
		return count + 1;
		
	}

}
