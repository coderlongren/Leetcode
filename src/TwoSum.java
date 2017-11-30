
public class TwoSum {

	public static void main(String[] args) {
		
		int[] test = {1,2,3,4,5};
		for (int i : twoSum(test, 4)){
			System.out.println(i);
		}
	}
	 public static int[] twoSum(int[] numbers, int target) {
	    if (numbers.length == 0 || numbers.length == 1){
	    	return null;
	    }
	    int min = 0;
	    int max = numbers.length - 1;
	    int[] result = new int[2];
	    while (max > min){
	    	if (numbers[min] + numbers[max] == target){
	    		result[0] = min + 1;
	    		result[1] = max + 1;
	    		break;
	    	}
	    	else if(numbers[min] + numbers[max] > target) {
				max--;
			}
	    	else{
	    		min++;
	    	}
	    		
	    }
	    return result;
	 }

}
