package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��14�� ����11:21:09
* ��˵��: 
*/
public class PrintMaxOfNDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrintMaxOfNDigits().Test(4);
	}
	public boolean Increment(int[] number){                 //  �������������ʵ�ֶ�����1����
        boolean isOverflow = false;
        int nTakeOver=0;
        for(int i=number.length-1;i>=0;i--){
            int nSum = number[i]+nTakeOver;
            if(i==number.length-1)
                nSum++;
            if(nSum>=10){
                if(i==0)
                    isOverflow=true;
                else{
                    nTakeOver=1;
                    nSum=nSum-10;
                    number[i]=nSum;
                }
            }
            else{
                number[i]=nSum;
                break;
            }
        }
        return isOverflow;
    }
	public void PrintNumber(int[] number){   //�÷����Ǹ����ӡһ�����࣬ǧ��Ҫ���Խ�������һ������
        boolean isBeginning=true;
        for(int i=0;i<number.length;i++){
            if(isBeginning&&number[i]!=0)
                isBeginning=false;
            if(!isBeginning){
                System.out.print(number[i]);
            }
        }
    }
	public void Test(int n){     //��ӡ��1������nλ����
        if(n<=0)
            System.out.println("����������������룡");
        int[] number = new int[n];

        while(!Increment(number)){
            PrintNumber(number);
            //System.out.println();
        }
    }

}
