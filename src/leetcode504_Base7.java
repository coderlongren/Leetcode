
public class leetcode504_Base7 {

	public static void main(String[] args) {
		System.out.println(convertToBase7(0));
	}
    public static String convertToBase7(int num) {
        
    	StringBuilder stringBuilder = new StringBuilder();
    	int flag = 0;
    	if (num <= 6 && num >= 0){
    		return stringBuilder.append(num%7).toString();
    	}
    	else if (num > 0){
    		flag = 1;
		}
    	else {
			flag = -1;
			num = Math.abs(num);
		}
    	stringBuilder.append(convert(num));
    	if (flag == 1){
    		;
    	}
    	if (flag == -1){
    		stringBuilder.insert(0, "-");
    	}
    	
    	
    	return stringBuilder.toString();
    }
    public static String convert(int num){
    	if (num < 7){
    		return num + "";
    	}
    	return convert(num/7) + num%7;
    }
}
