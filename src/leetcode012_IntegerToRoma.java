
public class leetcode012_IntegerToRoma {

	public static void main(String[] args) {
		
		System.out.println(IntegerToRoma(122));
	}
	
	//构造罗马数组 
	public static String IntegerToRoma(int num){
		final int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		final String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"}; 
		String result="";
		//以下是核心算法
		for (int i = 0; i < values.length;i++){
			while (num >= values[i]){
				num = num - values[i];
				result = result+symbol[i];
			}
			if (num == 0){
				break;
			}
		}
		return result;
	}

}