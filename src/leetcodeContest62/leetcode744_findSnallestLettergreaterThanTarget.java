package leetcodeContest62;

public class leetcode744_findSnallestLettergreaterThanTarget {

	public static void main(String[] args) {
		char c = (char)Math.min('a', 'c');
		System.out.println(c);
		char[] array = {'c','f','j'};
		char target = 'j';
		System.out.println(nextGreatestLetter(array, target));
	}
	 public static char nextGreatestLetter(char[] letters, char target) {
	        boolean flag = false;
		 Character test= 'z';
		 char min = 'z';
		 for (char c : letters) {
			 min = (char) Math.min(min, c);
		 }
		 for (char c : letters) {
			if (c > target){
				test = c;
				flag = true;
				break;
			}
		}
		 if (!flag){
			 return min;
		 }
		 for (char c : letters) {
			if (c > target){
				test = (char) Math.min(c, test);
			}
		}
		 
		 return test;
	 }
}
