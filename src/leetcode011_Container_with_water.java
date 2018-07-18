/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��7��18�� ����6:54:25
* ��˵��: 
*/
public class leetcode011_Container_with_water {
	public static void main(String[] args) {
		
	}
	public int maxArea(int[] height) {
        int sum = 0;
        if (height == null || height.length <= 1) {
        	return sum;
        }
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
        	sum = Math.max(sum, Math.min(height[left], height[right])*(right - left));
        	
        	if (height[left]<height[right]) {
        		left++;
        	}
        	else {
        		right--;
        	}
        	
        }
        return sum;
    }
}
