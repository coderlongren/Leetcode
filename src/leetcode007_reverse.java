
public class leetcode007_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( Integer.MAX_VALUE);
		
		String string = "  ss  ";
		string = string.trim();
		
	}
	public int reverse(int x){
		int result = 0;
		while (x != 0) {
			int tail = x%10;
			int newresult = result*10 + tail;
			if ((newresult - tail)/10 != result){
				//如果 这里不相同的话  说明是溢出 
				return 0;
			}
			result = newresult;
			x = x/10;
		}
		return result;
		
		
	}

}
