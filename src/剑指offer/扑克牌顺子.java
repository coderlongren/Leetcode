package ��ָoffer;

import java.util.Arrays;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��9�� ����5:21:49
* ��˵��: 
*/
public class �˿���˳�� {
	public boolean isContinuous(int [] numbers) {
		if (numbers == null || numbers.length  == 0) {
			return false;
		}
        if (numbers.length == 1) {
            return true;
        }
		int zeroNum = 0; //  0����Ŀ
		int dis = 0;
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] == 0) {
				zeroNum++;
			}
			else if (numbers[i + 1] == numbers[i]){
				return false;
			}
			else {
				dis += numbers[i + 1] - numbers[i] - 1;
			}
		}
		if (zeroNum - dis < 0) {
			return false;
		}
		else {
			return true;
		}
		
    }
}
