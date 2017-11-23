import javax.sound.sampled.ReverbType;

public class leetcode190_ReverseBits {

	public static void main(String[] args) {
		System.out.println(reverseBits(43261596));
	}
	 public static int reverseBits(int n) {
		 if (n == 0){
			 return 0;
		 }
		 
		 
		 
		 String binaryStr = Integer.toBinaryString(n);
		 int len = binaryStr.length();
		 StringBuilder stringBuilder = new StringBuilder(binaryStr);
		 String temp = "";
		 for (int i = 0;i < 32-len;i++){
			 temp += "0";
		 }
//		 stringBuilder = new StringBuilder(temp).append(stringBuilder);
		 stringBuilder = stringBuilder.append(new StringBuilder(temp));
		 stringBuilder.reverse();
		 int res = Integer.parseInt(Integer.valueOf(stringBuilder.toString(), 2).toString());
		 return res;
	 }

}
