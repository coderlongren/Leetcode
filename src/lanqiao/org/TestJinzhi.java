package lanqiao.org;

import java.util.Scanner;

/*** Java 提交 超时  C++ 提交 通过了 无奈 
 * #include <iostream>
#include <string>
using namespace std;

int main()
{
    int n;
    cin>>n;
    for(int k=1;k<=n;k++)
    {
        string s1,s2;//s1为输入的原始的十六进制串，s2为转化成的二进制串
        cin>>s1;
        s2="";//初始化
        for(int i=0;i<s1.length();i++)//遍历，字符串上加上每一位
        {
            switch(s1[i])
            {
                case '0':s2+="0000";break;
                case '1':s2+="0001";break;
                case '2':s2+="0010";break;
                case '3':s2+="0011";break;
                case '4':s2+="0100";break;
                case '5':s2+="0101";break;
                case '6':s2+="0110";break;
                case '7':s2+="0111";break;
                case '8':s2+="1000";break;
                case '9':s2+="1001";break;
                case 'A':s2+="1010";break;
                case 'B':s2+="1011";break;
                case 'C':s2+="1100";break;
                case 'D':s2+="1101";break;
                case 'E':s2+="1110";break;
                case 'F':s2+="1111";break;
                default:break;
            }
        }
        int len=s2.length();

        if(len%3==1)//三个二进制为一位八进制，二进制串前面补0，确保二进制串的长度为3的倍数
            s2="00"+s2;
        else if(len%3==2)
            s2="0"+s2;
        int flag=0;
        for(int i=0;i<=s2.length()-3;i+=3)
        {
            int num=4*(s2[i]-'0')+2*(s2[i+1]-'0')+(s2[i+2]-'0');
            if(num)
                flag=1;//忽略前导0
            if(flag)
                cout<<num;
        }
        cout<<endl;
    }
    return 0;
}
 * @author Administrator
 *
 */

public class TestJinzhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n  = scanner.nextInt();
		String[] result = new String[n];
		for (int i = 0; i < n; i++){
			String s1,s2;
			s2 = "";
			s1 = scanner.next();
			char[] ss1 = s1.toCharArray();
			for (int j = 0; j < ss1.length; j++){
				
				switch (ss1[j]) {
				case '0':
					s2 += "0000";
					break;
				case '1':
					s2 += "0001";
					break;
				case '2':
					s2 += "0010";
					break;
				case '3':
					s2 += "0011";
					break;
				case '4':
					s2 += "0100";
					break;
				case '5':
					s2 += "0101";
					break;
				case '6':
					s2 += "0110";
					break;
				case '7':
					s2 += "0111";
					break;
				case '8':
					s2 += "1000";
					break;
				case '9':
					s2 += "1001";
					break;
				case 'A':
					s2 += "1010";
					break;
				case 'B':
					s2 += "1011";
					break;
				case 'C':
					s2 += "1100";
					break;
				case 'D':
					s2 += "1101";
					break;
				case 'E':
					s2 += "1110";
					break;
				case 'F':
					s2 += "1111";
				default:
					break;
				}
				
			}
			//得到的 新字符串的长度 
			int len = s2.length();
			if (len % 3 == 1){
				s2 = "00" + s2;
			}
			else if (len % 3 == 2){
				s2 = "0" + s2;
			}
			else {
				;
			}
			int flag = 0;
			for (int k = 0,x = 0; k <= s2.length() - 3;k = k + 3,x++){
				int num = 4*(s2.charAt(k) - '0') + 2*(s2.charAt(k + 1) - '0') + (s2.charAt(k + 2) - '0');
				if (num > 0){
					flag = 1;
				}
				if (flag == 1){
					System.out.print(num);
				}
				
			}
		}
		
	}
	
	

}
