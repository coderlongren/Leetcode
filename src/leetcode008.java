import org.omg.CORBA.LongLongSeqHelper;


public class leetcode008 {
	
	
//	(^..^)(^..^)(^..^)(^..^)(^..^)(^..^) 
	public static void main(String[] args) {
		String str = "-9223372036854775809";
		System.out.println(Integer.MAX_VALUE );
		System.out.println(Integer.MIN_VALUE);
		System.out.println(atoi(str));
	}
	public static int atoi(String str){
		
//		Integer.valueOf("123");
		//超过边界值会溢出
		int MAX = Integer.MAX_VALUE;
		int MIN = Integer.MIN_VALUE;
		long result = 0;
		int flag = 1;//记录正负号
		char[] chars = str.toCharArray();
		int len = chars.length;
		int i = 0;
		if (str == null || str.equals("")){
            return 0;
        }
		//忽略前导空格s
		while ((chars[i] == ' ' || chars[i] == '0') && i < chars.length - 1){
			i++;
		}
		if(chars[i] == '-'){
			i++;
			flag = -1;
		}
		else if (chars[i] == '+'){
			i++;
			flag = 1;
		}
//		(^..^)(^..^)(^..^)(^..^)(^..^)(^..^) 
		
		while (i< len){
			
			if (chars[i] <= '9' && chars[i] >= '0'){
				result = result*10;
				result += (chars[i] - '0');
				
				if (result*flag  > MAX){
					return MAX;
				}
				
				if (result*flag < MIN){
					return MIN;
				}
				i++;
			}
			else {
				break;
			}
			
		}
		
		result = result*flag;
		if (result > MAX){
			return MAX;
		}
		if (result < MIN){
			return MIN;
		}
		return (int) result;
	}
//		for (int i = 0; i < chars.length; i++){
//			System.out.print(chars[i] + " ");
//		}

//		System.out.println("len = " + len);
//		int result = 0;
//		for (int i = 0; i < len; i++){
//			int wei = 1;
//			for (int j = 0; j < len - i - 1; j++){
//				wei*=10;
//				System.out.println("wei = " + wei);
//			}
//			int temp = (int)chars[i] - 48;
//			System.out.println("temp = " + temp);
//			result = result + temp * wei;
//			System.out.println("result = " + result);
//		}
//		(^..^)(^..^)(^..^)(^..^)(^..^)(^..^) 
	

}
