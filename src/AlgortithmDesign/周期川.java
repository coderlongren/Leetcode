package AlgortithmDesign;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��12�� ����2:59:51
* ��˵��: 
*/
public class ���ڴ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMin("abcabcabcabc"));
	}
	public static int getMin(String string){
		// �����Ҽ�������õ� ���Ӵ��Ľⷨ
		
		for (int i = 1; i <= string.length(); i++){// i�����Ӵ��ĳ��ȣ���С��1
			if (string.length() % i == 0){
				boolean flag = true;
				for (int j = i; j < string.length(); j++){
					// ����һ�д���ǳ� ���j == j%i 
					if (string.charAt(j) != string.charAt(j%i)){
						flag = false;
						break;
					}
				}
				if (flag){
					return i; // �ҵ�����С�� ֱ�ӷ���
				}
			}
		}
		return string.length();
	}

}
