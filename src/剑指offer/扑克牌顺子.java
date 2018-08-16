package 剑指offer;

import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月9日 下午5:21:49
* 类说明: 
*/
public class 扑克牌顺子 {
	public boolean isContinuous(int [] numbers) {
		if (numbers == null || numbers.length  == 0) {
			return false;
		}
        if (numbers.length == 1) {
            return true;
        }
		int zeroNum = 0; //  0的数目
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
