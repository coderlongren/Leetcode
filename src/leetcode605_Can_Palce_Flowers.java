/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��13�� ����3:37:44
* ��˵��: 
*/
public class leetcode605_Can_Palce_Flowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flowerbed = {0};
		System.out.println(canPlaceFlowers(flowerbed, 3));
	}
	// ��������ʹ�õ� ̰���㷨�� ֻҪ��֤�ڵ�ǰ״���������ǵģ���ô����Ҳ���ܱ�֤������
	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		 int count = 0;
		 int i = 0;
		 
		 if (flowerbed.length == 1 && flowerbed[0] == 0){
			 return true;
		 }
		 
		 
		 // ��Ҫ��ÿһ��ѭ��ʱ�򣬱�֤���Ž�
		 
		 while (i < flowerbed.length){
			 
			 // 
			 while (i < flowerbed.length && flowerbed[i] == 0){
				 i++;
				 // ���ѡ���� 00 �����ڿ�ʼ������ ����λ�� ��һ�仨
				 if ((i == 1 || i == flowerbed.length - 1) && i < flowerbed.length && flowerbed[i] == 0){
					 count++;
				 }
				 // ���� ����else if() ��Ϊ���˵�ѡ���ǲ��ܺ� 2~length - 2֮����ظ�ѡ���
				 // i - 1λ���Ѿ���0�ˣ�����ٱ�֤ i, i + 1λ��Ҳ��0�Ļ����Ϳ�����һ�仨��
				 else if (i < flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[++i] == 0){
					 count++;
				 }
			 }
		 	i++;
			 if (count >= n){
				return true; 
			 }
		 }
		 return false;
	 }

}
