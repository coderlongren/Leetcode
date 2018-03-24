import org.w3c.dom.css.ElementCSSInlineStyle;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��27�� ����9:58:43
* ��˵��:  ʲô��û�п��ǣ���ʵ�ǿ���ͨ�����ַ���ʵ�ֵ�
*/
public class leetcode033_Search_in_Rotated_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,4,5,6,7,0,1,2};
		int[] numss = {0,0,0,1,0};
		System.out.println(search2(numss, 3));
	}	 	
	// it is a joke
	public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] == target) {
        		return i;
        	}
        }
        
        return -1;
    }
	// example : 0 1 2 3 4 5 6 7
	// 3 4 5 6 7 0 1 2
	public  static int search1(int[] nums, int target) {
		// �������ö������� �ҵ���С��Ԫ��
		int low = 0;
		int high = nums.length - 1;
		
		while (low < high) {
			int mid = (low + high)/2;
			if (nums[mid] > nums[high]) {
				// ��ǰ���� ����
				low = mid + 1;
			}
			else {
				high = mid;
			}
		}
//		return nums[low];?
		int rot = low;
		low = 0;
		high = nums.length - 1;
		
		while (low <= high) {
			int mid = (low + high)/2;
			int realMid = (mid + rot)%nums.length; // �õ��������Ķ��ֵ�
			if (target < nums[realMid]) {
				high = mid - 1;
			}
			else if (target > nums[realMid]){
				low = mid + 1;
			}
			else {
				return realMid;
			}
		}
		return -1;
	}
	// ����Ѱ�����Ҳ���
public static int search2(int[] nums, int target) {
    int low = 0, high = nums.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        // ��벿���������
        if (nums[mid] < nums[high]) {
        	// target ���������Χ֮��
            if (nums[mid] < target && target <= nums[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            
        }
        // ǰ�벿�ֲ��������
        else {
        	// target ��ǰ�벿�� ������ģ� ����Χ֮�� ��Ϊǰ�벿�ֵ�ǰ�벿���������
            if (nums[low] <= target && target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }
    return -1;
}
// ����duplicateԪ��
public static boolean search3(int[] nums, int target) {
    int low = 0, high = nums.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            return true;
        }
        if (nums[mid] < nums[high]) { // ��벿���������
            if (nums[mid] < target && target <= nums[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        } 
        else if (nums[mid] > nums[high]) {// First half may be sorted eg.[0,1,4,5,0] or all the same eg.[4,4,4,5,0]
            if (nums[low] <= target && target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // ������ �ط���
        else {   // A[mid] = A[high] and A[mid]<>target, so it's safe to shrink from high bound
            high--;
        }
    }
    return false;
}
}
