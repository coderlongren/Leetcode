
public class leetcode006_convert {
//ZigZag���ݸ�ʽ  �����ܿ���Zig���ݹ��� �Ϳ�������� Ȼ�������ÿ�������
	public static void main(String[] args) {
		String string = "PAYPALISHIRING";
		System.out.println(convert("PAYPALISHIRING", 3));
		
	}
    public static String convert(String s, int numRows) {
    	if (numRows == 1 || numRows == 0){
    		return s;
    	}
    	char[] chars = s.toCharArray();
    	//����һ�� ��ά��string���� 
    	int length = s.length();
    	StringBuffer[] stringBuffers = new StringBuffer[numRows];
    	for (int i = 0; i < numRows; i++){
    		stringBuffers[i] = new StringBuffer();
    	}
    	int i = 0;
    	while (i < length){
    		for (int x = 0; x < numRows && i < length;x++){
    			stringBuffers[x].append(chars[i]);
    			i++;
    		}
    		for (int y = numRows - 2; y >= 1 && i < length; y--){
    			stringBuffers[y].append(chars[i]);
    			i++;
    		}
    	}
    	StringBuffer result = new StringBuffer();
    	for (int j = 0; j < numRows ;j++){
    		result.append(stringBuffers[j]);
    	}
        return result.toString();
    }
	

}
