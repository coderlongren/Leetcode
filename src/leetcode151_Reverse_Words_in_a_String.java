/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��11�� ����4:02:05
* ��˵��: 
*/
public class leetcode151_Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String reverseWords(String s) {
		String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1; i>= 0; i--){
            if(arr[i].length() == 0) {
                continue;
            }
            sb.append(arr[i] + " ");          
        }
        
        return sb.toString().trim();
	}
}
