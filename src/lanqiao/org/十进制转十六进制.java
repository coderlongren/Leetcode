package lanqiao.org;

import java.util.Scanner;

public class ʮ����תʮ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(decimalToHex(x));
	}
	
	//ת���ķ���
	public static String decimalToHex(int decimal){
		if (decimal == 0){
			return "0";
		}
		String Hex = "";
		while (decimal != 0){
			int HexValue = decimal%16;
			Hex = toHex(HexValue) + Hex;
			decimal = decimal/16;
		}
		return Hex;
	}
	//��0~15�� ʮ�������� ת��Ϊ 0~F��ʮ����������
	public static char toHex(int decimal){
		if (decimal <= 9 && decimal >= 0){
			return (char) (decimal + '0');
		}
		else{
			return (char) (decimal - 10 + 'A');
		}
		
		
	} 
}
