
public class leetcode088_Merge_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	       //num1 �Ŀռ��Ǳ�num2��� 
		 int i = 0;
		 int j = 0;
		 int k = 0;
		 while (i < m && j < n){
			 nums1[k++] = m > 0 && nums1[i] > nums2[j] ? nums2[j++]:nums1[i++];
			 
		 }
		 // ���� nums1��ʣ���Ԫ�� ���뼴��
		 while (i < m + n - 1){
			 nums1[k++] = nums1[i++];
		 }
	 }

}
