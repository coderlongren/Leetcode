
public class leetcode013 {
/****
 * 
 * @param 罗马数字转为Integer
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "DCXXI";
		System.out.println(romanToInt(string));
	}
	//转换罗马字符
	public static int Charin(char s){
		int data = 0;
		switch (s) {
		case 'I':
			data = 1;
			break;
		case 'V':
			data = 5;
			break;
		case 'X':
			data = 10;
			break;
		case 'L':
			data = 50;
			break;
		case 'C':
			data = 100;
			break;
		case 'D':
			data = 500;
			break;
		case 'M':
			data = 1000;
			break;
		}
		return data;
	}
	
    public static int romanToInt(String s) {
    	int i;
//    	int tatol = Charin(s.charAt(0));
    	int tatol = 0;
    	for (i = 0; i < s.length() - 1; i++){
    		int current = Charin(s.charAt(i));
    		int next = Charin(s.charAt(i + 1));
    		if (current < next){
    			tatol = tatol - current;
    		}
    		else{
    			
				tatol  = tatol + current;
			}
				
    	}
        return tatol + Charin(s.charAt(s.length() - 1));
    }
	
	

}
